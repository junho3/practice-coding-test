package leetcode.easy;

public class Solution704 {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        int result = -1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            int num = nums[midIndex];

            if (target > num) {
                // midIndex + 1 ~ endIndex 탐색
                startIndex = midIndex + 1;
            } else if(num > target) {
                // startIndex ~ midIndex - 1 탐색
                endIndex = midIndex - 1;
            } else {
                result = midIndex;
                break;
            }
        }

        return result;
    }
}
