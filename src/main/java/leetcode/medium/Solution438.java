package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        final List<Integer> results = new ArrayList<>();

        int[] sCounts = new int[26];
        int[] pCounts = new int[26];

        final int pLength = p.length();
        for (char ch : p.toCharArray()) {
            pCounts[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCounts[s.charAt(i) - 'a']++;

            if (i >= pLength) {
                sCounts[s.charAt(i - pLength) - 'a']--;
            }

            if (Arrays.equals(pCounts, sCounts)) {
                results.add(i - pLength + 1);
            }
        }

        return results;
    }
}
