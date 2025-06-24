package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }

        return maxLength;
    }
}
