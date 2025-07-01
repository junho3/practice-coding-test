package leetcode.medium;

public class Solution189 {
    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        int rotate = k % n;

        int[] temp = new int[rotate];
        for (int i = 0; i < n; i++) {
            temp[(i + rotate) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate2(int[] nums, int k) {
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
