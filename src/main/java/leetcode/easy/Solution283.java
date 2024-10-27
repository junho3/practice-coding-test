package leetcode.easy;

public class Solution283 {
    public void moveZeroes(int[] nums) {
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]

        int i = 0;
        int j = 0;
        int n = nums.length;

        while (i < n) {
            int number = nums[i];

            if (number != 0) {
                nums[i] = nums[j];
                nums[j] = number;
                j++;
            }

            i++;
        }
    }
}
