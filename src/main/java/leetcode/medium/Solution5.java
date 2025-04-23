package leetcode.medium;

public class Solution5 {
    public String longestPalindrome(String s) {
        int start = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            // aba 케이스
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > length) {
                    start = left;
                    length = right - left + 1;
                }

                left--;
                right++;
            }

            // aa 케이스
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > length) {
                    start = left;
                    length = right - left + 1;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + length);
    }
}
