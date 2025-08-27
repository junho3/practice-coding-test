package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {

    public List<Integer> findAnagrams_bruteforce(String s, String p) {
        // 시간복잡도 O(N^2)
        // 공간복잡도 O(1)

        List<Integer> result = new ArrayList<>();

        int[] pArr = new int[26];
        for (char ch : p.toCharArray()) {
            pArr[ch - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] sArr = new int[26];

            for (int j = i; j < i + p.length(); j++) {
                sArr[s.charAt(j) - 'a']++;
            }

            if (Arrays.equals(sArr, pArr)) {
                result.add(i);
            }
        }

        return result;
    }

    public List<Integer> findAnagrams(String s, String p) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        List<Integer> result = new ArrayList<>();

        int[] pArr = new int[26];
        for (char ch : p.toCharArray()) {
            pArr[ch - 'a']++;
        }

        int[] sArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                sArr[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(pArr, sArr)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
