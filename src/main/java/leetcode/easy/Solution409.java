package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution409 {
    public int longestPalindrome(String s) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        Set<Character> set = new HashSet<>();

        int result = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                result += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        if (!set.isEmpty()) {
            result++;
        }

        return result;
    }
}
