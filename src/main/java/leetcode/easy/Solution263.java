package leetcode.easy;

public class Solution263 {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }

        int number = n;
        while (number != 1) {
            if (number % 5 == 0) {
                number = number / 5;
                continue;
            }

            if (number % 3 == 0) {
                number = number / 3;
                continue;
            }

            if (number % 2 == 0) {
                number = number / 2;
                continue;
            }

            return false;
        }

        return true;
    }
}
