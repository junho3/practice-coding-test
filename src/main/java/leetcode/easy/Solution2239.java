package leetcode.easy;

public class Solution2239 {
    public int findClosestNumber(int[] nums) {
        int number = 0;
        int difference = Integer.MAX_VALUE;
        for (int num : nums) {
            int absNumber = Math.abs(num);

            if (difference > absNumber) {
                difference = absNumber;
                number = num;
            } else if (difference == absNumber) {
                number = number > 0 ? number : num;
            }
        }

        return number;
    }
}
