package leetcode.medium;

public class Solution75 {
    public void sortColors(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(1)

        int left = 0;
        int curr = 0;
        int right = nums.length - 1;

        while (curr <= right) {
            int num = nums[curr];

            if (num == 0) {
                nums[curr] = nums[left];
                nums[left] = num;
                left++;
                curr++;
            } else if (num == 1) {
                curr++;
            } else {
                nums[curr] = nums[right];
                nums[right] = num;
                right--;
            }
        }
    }
}
