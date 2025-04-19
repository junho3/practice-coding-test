package leetcode.medium;

import java.util.HashMap;
import java.util.Set;

public class Solution75 {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                // left 와 Mid 스왑
                nums[mid] = nums[left];
                nums[left] = 0;

                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                nums[mid] = nums[right];
                nums[right] = 2;

                right--;
            }
        }
    }
}
