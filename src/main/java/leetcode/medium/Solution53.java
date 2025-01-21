package leetcode.medium;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;

        for (int num : nums) {
            // 합산한 수가 음수인 경우는 의미가 없음
            // index = 0(처음)부터 N까지 순회하기 때문에 이전 index의 음수들은 최대값 구하는데 도움이 안됨
            // 결국 양수 index부터 N까지가 최대값이 나올 수 밖에 없음
            if (sum < 0) {
                sum = 0;
            }
            sum += num;

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
