package leetcode.medium;

import java.util.HashMap;

public class Solution424 {

    public int characterReplacement_bruteforce(String s, int k) {
        // 시간복잡도 O(N^2)
        // 공간복잡도 O(1)

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] arr = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                arr[ch - 'A']++;

                max = Math.max(max, arr[ch - 'A']);
                int length = j - i + 1;

                if (length - max <= k) {
                    result = Math.max(result, length);
                } else {
                    break;
                }
            }
        }

        return result;
    }

    public int characterReplacement(String s, int k) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int[] counts = new int[26];

        int longestLength = 0;
        int maxCount = 0;

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            counts[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, counts[s.charAt(right) - 'A']);

            int length = right - left + 1;
            while (length - maxCount > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
                length = right - left + 1;
            }

            longestLength = Math.max(longestLength, length);
            right++;
        }

        return longestLength;
    }
}
