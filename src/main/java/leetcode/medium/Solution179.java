package leetcode.medium;

import java.util.Arrays;

public class Solution179 {
    public String largestNumber(int[] nums) {

        int n = nums.length;

        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }

        // 문자열을 "ab"와 "ba"로 조합했을 때 큰 수대로 정렬
        Arrays.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        if ("0".equals(numbers[0])) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(numbers[i]);
        }

        return sb.toString();
    }
}
