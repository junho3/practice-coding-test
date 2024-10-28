package leetcode.medium;

import java.util.Arrays;

public class Solution1679 {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int result = 0;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == k) {
                result++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
