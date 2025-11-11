package leetcode.medium;

public class Solution209 {

    // 합계가 target보다 크거나 같은 하위 배열의 최소 길이 구하기

    public int minSubArrayLen(int target, int[] nums) {

        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int n = nums.length;

        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < n) {
            sum += nums[right];

            while (sum >= target) {
                int length = right - left + 1;

                if (minLength > length) {
                    minLength = length;
                }

                sum -= nums[left];
                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}
