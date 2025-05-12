package leetcode.medium;

public class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        // 시간복잡도 O(log n)
        // 공간복잡도 O(1)

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
