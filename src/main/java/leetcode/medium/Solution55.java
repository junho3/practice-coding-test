package leetcode.medium;

public class Solution55 {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        int i = goal;
        while (i > 0) {
            i--;

            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }
}
