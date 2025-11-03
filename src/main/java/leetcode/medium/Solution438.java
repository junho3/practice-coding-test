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

        int[] pArr = new int[26];
        for (char ch : p.toCharArray()) {
            pArr[ch - 'a']++;
        }

        List<Integer> result = new ArrayList<>();
        int[] windows = new int[26];

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            windows[s.charAt(right) - 'a']++;
            right++;

            if (right - left > p.length()) {
                windows[s.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(pArr, windows)) {
                result.add(left);
            }
        }

        return result;
    }
}
