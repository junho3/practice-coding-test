package leetcode.medium;

public class Solution238 {
    public int[] productExceptSelf(int[] nums) {

        // 1. index 기준으로 prefix 계산 (0 ~ index - 1의 곱)

        // 2. index 기준으로 postfix 계산 (index + 1 ~ num.length의 곱)

        // 3. index 기준으로 prefix와 postfix를 곱함

        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }

        return result;
    }
}
