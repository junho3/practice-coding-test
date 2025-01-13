package leetcode.medium;

public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {

        // 1. nums 순회

        // 2. 현재수가 이전수보다 큰지 확인

        // 3. 현재수가 크면 계속 진행

        // 4. 현재수가 작으면 종료 및 길이 측정

        int maxLength = 0;
        int startIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int cur = nums[i];

            if (cur <= prev) {
                int length = i - startIndex;
                maxLength = Math.max(maxLength, length);
                startIndex = i;
            }
        }

        return Math.max(maxLength, nums.length - startIndex);
    }
}
