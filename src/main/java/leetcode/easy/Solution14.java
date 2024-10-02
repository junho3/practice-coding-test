package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        // ["flower","flow","flight"]

        // 1. 가장 작은 문자 길이 찾기
        int n = strs.length;

        String shortestString = Arrays.stream(strs)
            .min(Comparator.comparingInt(String::length))
            .orElse(null);
        int shortestStringLength = shortestString.length();

        // 2. 가장 작은 문자를 기준으로 비교해보기
        String result = "";
        for (int i = 0; i < shortestStringLength; i++) {
            char shortestCh = shortestString.charAt(i);

            for (int j = 0; j < n; j++) {
                char ch = strs[j].charAt(i);

                if (shortestCh != ch) {
                    return result;
                }
            }

            result += shortestCh;
        }

        return result;
    }
}
