package leetcode.medium;

public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int n = nums.length;
        boolean result = false;
        for (int i = 0; i < n; i++) {
            int number = nums[i];

            if (number <= min1) {
                min1 = number;
            } else if (number <= min2) {
                min2 = number;
            } else {
                result = true;
                break;
            }
        }

        return result;
    }
}
