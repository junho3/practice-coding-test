package leetcode.medium;

public class Solution153 {
    public int findMin(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if (nums[midIndex] > nums[endIndex]) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex;
            }
        }

        return nums[startIndex];
    }
}
