package leetcode.medium;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(1)
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            // 지금까지의 합이 숫자보다 작으면 해당 숫자부터 시작
            if (sum <= nums[i]) {
                sum = nums[i];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
