package leetcode.medium;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(1)

        // 1. 오른쪽에서 왼쪽으로 보면서 처음으로 nums[i] < nums[i + 1] 인 지점(pivot) 찾기
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // 2. pivot이 유효하면 nums[pivot]보다 큰 가장 오른쪽 수와 swap
        if (pivot >= 0) {
            for (int i = nums.length - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        // 3. pivot 이후 구간을 오름차순 정렬 (reverse)
        int left = pivot + 1;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
