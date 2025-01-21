package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int startIndex = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // set의 문자를 지우면서 startIndex를 증가시킴
            // ABCDEA 가 있을 때 0번(A)부터 4번(E)까지 startIndex를 0에서 4로 증가시킴
            while (set.contains(ch)) {
                set.remove(ch);
                startIndex++;
            }

            set.add(ch);

            maxLength = Math.max(maxLength, i - startIndex + 1);
        }

        return maxLength;
    }
}
