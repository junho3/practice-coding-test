package leetcode.medium;

import java.util.Arrays;

public class Solution137 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;
        int i = 0;

        while (i < n) {
            int number1 = nums[i];
            if (i == n - 1) {
                result = number1;
                break;
            }
            int number2 = nums[i + 2];

            if (number1 != number2) {
                result = number1;
                break;
            }

            i = i + 3;
        }

        return result;
    }
}
