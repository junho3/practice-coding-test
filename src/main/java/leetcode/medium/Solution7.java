package leetcode.medium;

public class Solution7 {

    // int x 숫자가 주어졌을 때 뒤집은 숫자를 리턴하기

    public int reverse1(int x) {

        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        String number = String.valueOf(x);
        int n = number.length();

        long reverseNumber = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0 && number.charAt(i) == '-') {
                reverseNumber = reverseNumber * -1;
                continue;
            }

            reverseNumber = reverseNumber * 10 + number.charAt(i) - '0';
        }

        if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverseNumber;
    }

    public int reverse2(int x) {

        int sign = x >= 0 ? 1 : -1;

        int temp = Math.abs(x);
        long result = 0;
        while (temp > 0) {
            result = (result * 10) + (temp % 10);
            temp = temp / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result * sign;
    }
}
