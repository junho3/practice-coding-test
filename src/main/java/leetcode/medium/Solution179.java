package leetcode.medium;

import java.util.Arrays;

public class Solution179 {
    public String largestNumber(int[] nums) {
        // String 배열 생성
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        // String 기준으로 정렬
        Arrays.sort(strings, (a, b) -> (b + a).compareTo(a + b));

        if ("0".equals(strings[0])) {
            return "0";
        }

        // String 배열 합침
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }

        return sb.toString();
    }
}
