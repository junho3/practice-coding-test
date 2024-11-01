package leetcode.easy;

public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double result = sum;
        for (int i = 1; i <= n - k; i++) {
            sum += (nums[i + k - 1] - nums[i - 1]);

            if (result < sum) {
                result = sum;
            }
        }

        return result / k;
    }
}
