package leetcode.easy;

import java.util.Arrays;

public class Solution268 {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int total = length * (length + 1) / 2;
        int sum = Arrays.stream(nums).sum();

        return total - sum;
    }
}
