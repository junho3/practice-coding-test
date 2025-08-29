package leetcode.medium;

public class Solution33 {
    public int search(int[] nums, int target) {
        // 시간복잡도 O(nlogn)
        // 공간복잡도 O(1)

        int result = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                break;
            }

            if (nums[left] <= nums[mid]) { // 왼쪽 정렬
                // 왼쪽에 target이 포함된 경우
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // 오른쪽 정렬
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return result;
    }
}
