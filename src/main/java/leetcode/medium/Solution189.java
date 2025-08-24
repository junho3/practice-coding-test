package leetcode.medium;

public class Solution189 {
    public void rotate1(int[] nums, int k) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        int length = nums.length;
        int rotate = k % length;

        reverse(nums, 0, length - 1);
        reverse(nums, 0, rotate - 1);
        reverse(nums, rotate, length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate2(int[] nums, int k) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        int length = nums.length;
        int rotate = k % length;

        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + rotate) % length] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, length);
    }

    public void rotate3(int[] nums, int k) {
        // 시간복잡도 O(n * k)
        // 공간복잡도 O(1)

        int n = nums.length;
        int rotate = k % n;

        for (int i = 0; i < rotate; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}
