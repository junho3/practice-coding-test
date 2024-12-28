package leetcode.easy;

import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
//            result += Math.min(nums[i], nums[i + 1]);
            // 정렬을 했기 때문에 무조건 nums[i]는 nums[i + 1]보다 작은 수라서 Math.min()할 필요 없음
            result += nums[i];
        }

        return result;
    }
}
