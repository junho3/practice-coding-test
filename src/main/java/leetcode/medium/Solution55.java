package leetcode.medium;

public class Solution55 {
    public boolean canJump(int[] nums) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(1)

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i) {
                return false;
            }

            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
