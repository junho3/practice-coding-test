package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] alphabetCounts = new int[26];

            for (char ch : str.toCharArray()) {
                alphabetCounts[ch - 'a']++;
            }

            String key = Arrays.toString(alphabetCounts);
            List<String> anagrams = map.getOrDefault(key, new ArrayList<>());
            anagrams.add(str);
            map.put(key, anagrams);
        }

        return new ArrayList<>(map.values());
    }
}
