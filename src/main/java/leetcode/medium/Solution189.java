package leetcode.medium;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        // 1. temp1[k] = nums[n-k] ~ nums[n]

        // 2. temp2[n-k] = num[0] ~ num[k-1]

        // 3. nums 순회하면서 셋팅

        int n = nums.length;

        // 회전해야하는 숫자의 개수
        // k가 nums.length 보다 클 경우를 고려해야함
        // k == nums.length 이라면 순회 전후 결과가 같음
        // 따라서 k % n 을 해서 나머지 숫자만큼만 순회하면 됨
        int reminder = k % n;

        int[] temp1 = new int[reminder];
        for (int i = 0; i < temp1.length; i++) {
            temp1[i] = nums[n - reminder + i];
        }

        int[] temp2 = new int[n - reminder];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = nums[i];
        }

        int temp1Idx = 0;
        int temp2Idx = 0;
        for (int i = 0; i < n; i++) {
            if (i < temp1.length) {
                nums[i] = temp1[temp1Idx];
                temp1Idx++;
            } else {
                nums[i] = temp2[temp2Idx];
                temp2Idx++;
            }
        }
    }
}
