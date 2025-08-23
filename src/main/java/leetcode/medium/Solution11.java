package leetcode.medium;

public class Solution11 {
    public int maxArea(int[] height) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(1)

        int left = 0;
        int right = height.length - 1;
        int width = height.length - 1;

        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            width--;
        }

        return max;
    }
}
