package leetcode.medium;

public class Solution11 {
    public int maxArea(int[] height) {
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49

        // 1. i = 0, j = height.length -1 2개의 포인터

        // 2. (i < j) 까지 순회

        // 2. i와 j비교 후 작은 값 x i ~ j 거리

        // 3. 값이 큰 것으로 업데이트

        int i = 0;
        int j = height.length - 1;
        int result = 0;

        while (i < j) {
            int iHeight = height[i];
            int jHeight = height[j];

            int h = Math.min(iHeight, jHeight);
            int w = j - i;
            int area = h * w;

            if (area > result) {
                result = area;
            }

            if (jHeight > iHeight) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
