package leetcode.medium;

public class Solution1004 {
    public int longestOnes(int[] nums, int k) {

        int zero = 0;
        int longestLength = 0;

        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[left] == 0) {
                    zero--;
                }

                left++;
            }

            longestLength = Math.max(longestLength, right - left + 1);
            right++;
        }

        return longestLength;
    }
}
