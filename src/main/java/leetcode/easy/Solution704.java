package leetcode.easy;

public class Solution704 {
    public int search(int[] nums, int target) {
        // 시간복잡도 O(logN)
        // 공간복잡도 O(N)

        int result = -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                result = mid;
                break;
            }
        }

        return result;
    }
}
