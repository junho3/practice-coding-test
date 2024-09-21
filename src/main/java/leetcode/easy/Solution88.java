package leetcode.easy;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int midx = m - 1; // 2 >> nums1[2] = 3
        int nidx = n - 1; // 2 >> nums2[2] = 6
        int right = m + n - 1; // 5 >> num1[5] = 0

        // 1. nidx가 0보다 클 때까지 nums1[midx]와 nums2[nidx] 비교
        while (nidx >= 0) {
            // 2. nums1[midx]가 크다면 nums1[right]에 셋팅하고, midx - 1, right - 1
            if (midx > 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                // 3. nums2[nidx]가 크다면 nums1[right]에 셋팅하고, nidx - 1, right - 1
                nums1[right] = nums2[nidx];
                nidx--;
            }

            right--;
        }
    }
}
