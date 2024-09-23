package leetcode.easy;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int num : nums) {
            if (num != val) {
                nums[result] = num;
                result++;
            }
        }

        return result;
    }
}
