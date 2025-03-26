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


    public int maxSubArray2(int[] nums) {
        // 1. nums[i]와 nums[i-n] + nums[i]를 비교해서 더 큰 값을 부분 최대 합에 할당
        // 2. 부분 최대 합과 전체 최대 합을 비교 후 전체 최대 합에 할당

        int currentMax = nums[0];
        int totalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            totalMax = Math.max(totalMax, currentMax);
        }

        return totalMax;
    }
}
