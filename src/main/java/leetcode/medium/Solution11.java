package leetcode.medium;

public class Solution11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int maxArea = 0;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int width = r - l;
            int area = minHeight * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
