package leetcode.medium;

import java.util.Arrays;

public class Solution416 {

    private Boolean[][] memo;

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        memo = new Boolean[nums.length][target + 1];

        return dfs(nums, 0, target);
    }

    private boolean dfs(int[] nums, int index, int target) {
        if (index == nums.length) {
            return target == 0;
        }

        if (target < 0) {
            return false;
        }

        if (memo[index][target] != null) {
            return memo[index][target];
        }

        memo[index][target] = dfs(nums, index + 1, target)
            || dfs(nums, index + 1, target - nums[index]);

        return memo[index][target];
    }
}
