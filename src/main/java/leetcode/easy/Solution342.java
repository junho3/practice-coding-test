package leetcode.easy;

public class Solution342 {
    public boolean isPowerOfFour(int n) {
        int number = n;

        while (number > 4) {
            if (number % 4 == 0) {
                number = number / 4;
            } else {
                break;
            }
        }

        if (number == 4 || number == 1) {
            return true;
        }

        return false;
    }
}
