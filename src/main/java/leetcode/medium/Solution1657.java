package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution1657 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] word1Arr = new int[26];
        int[] word2Arr = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            word1Arr[char1 - 'a']++;
            word2Arr[char2 - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (word1Arr[i] == 0 && word2Arr[i] != 0 || word1Arr[i] != 0 && word2Arr[i] == 0) {
                return false;
            }
        }

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);
        for (int i = 0; i < word1Arr.length; i++) {
            if (word1Arr[i] != word2Arr[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean closeStrings2(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashSet<Character> word1Set = new HashSet<>();
        HashSet<Character> word2Set = new HashSet<>();
        HashMap<Character, Integer> word1Map = new HashMap<>();
        HashMap<Character, Integer> word2Map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            word1Set.add(char1);
            word2Set.add(char2);

            word1Map.put(char1, word1Map.getOrDefault(char1, 0) + 1);
            word2Map.put(char2, word2Map.getOrDefault(char2, 0) + 1);
        }

        if (word1Set.size() != word2Set.size()) {
            return false;
        }

        for (Character ch : word1Set) {
            if (!word2Set.contains(ch)) {
                return false;
            }
        }

        Object[] word1Arr = word1Map.values().toArray();
        Object[] word2Arr = word2Map.values().toArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        for (int i = 0; i < word1Arr.length; i++) {
            if (!word1Arr[i].equals(word2Arr[i])) {
                return false;
            }
        }

        return true;
    }
}
