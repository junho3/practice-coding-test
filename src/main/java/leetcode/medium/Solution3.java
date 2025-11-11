package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring_Bruteforce(String s) {
        // 시간복잡도 O(N^2)
        // 공간복잡도 O(N)

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);
            }
            result = Math.max(result, set.size());
        }

        return result;
    }

    public int lengthOfLongestSubstring(String s) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N)

        int n = s.length();

        int longestLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;

        while (right < n) {
            char rightChar = s.charAt(right);

            while (set.contains(rightChar)) {
                char leftChar = s.charAt(left);

                set.remove(leftChar);
                left++;
            }

            set.add(rightChar);

            if (set.size() > longestLength) {
                longestLength = set.size();
            }

            right++;
        }

        return longestLength;
    }
}
