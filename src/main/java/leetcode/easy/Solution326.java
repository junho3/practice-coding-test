package leetcode.easy;

public class Solution326 {
    public boolean isPowerOfThree(int n) {
        int number = n;
        while (number > 3) {
            if (number % 3 == 0) {
                number = number / 3;
            } else {
                break;
            }
        }

        // 3^0 == 1
        if (number == 3 || number == 1) {
            return true;
        }

        return false;
    }
}
