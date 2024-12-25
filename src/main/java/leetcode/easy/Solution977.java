package leetcode.easy;

public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int resultIndex = result.length - 1;
        while (i < j) {
            int iNum = Math.abs(nums[i]);
            int jNum = Math.abs(nums[j]);

            if (iNum >= jNum) {
                result[resultIndex] = iNum * iNum;
                i++;
            } else {
                result[resultIndex] = jNum * jNum;
                j--;
            }

            resultIndex--;
        }

        return result;
    }
}
