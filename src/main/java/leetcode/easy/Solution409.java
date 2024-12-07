package leetcode.easy;

import java.util.HashSet;

public class Solution409 {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        int result = 0;
        for (char c : s.toCharArray()) {
            // 1. 맵에 있으면
            if (set.contains(c)) {
                result += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            result++;
        }

        return result;
    }
}
