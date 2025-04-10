package leetcode.medium;

public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // mid를 기준으로 어느쪽이 정렬되었는지 판단해야함
            // 먼저 정렬된 쪽에서 target이 있는지 확인하고
            // 있으면 정렬된 쪽에서 계속 탐색
            // 없으면 정렬되지 않은 쪽에서 계속 탐색
            if (nums[left] <= nums[mid]) {
                // 왼쪽이 정렬된 상태

                // target이 정렬된 쪽(왼쪽)에 포함하는가?
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 오른쪽이 정렬된 상태

                // target이 정렬된 쪽(오른쪽)에 포함하는가?
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
