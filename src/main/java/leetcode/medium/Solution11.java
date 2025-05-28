package leetcode.medium;

public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int width = right - left;

            max = Math.max(Math.min(leftHeight, rightHeight) * width, max);

            if (leftHeight > rightHeight) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}
