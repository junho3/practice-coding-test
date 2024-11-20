package leetcode.easy;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        int number = n;
        while (number > 0) {
            int div = number % 2;

            if (number == 1) {
                return true;
            } else if (div == 1) {
                return false;
            }

            number = number / 2;
        }

        return false;
    }
}
