package leetcode.easy;

public class Solution66 {
    public int[] plusOne(int[] digits) {
//        Input: digits = [1,2,3]
//        Output: [1,2,4]

        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
