package leetcode.medium;

public class Solution7 {
    public int reverse1(int x) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(x);

        int range = x >= 0 ? 0 : 1;
        for (int i = s.length() - 1; i >= range; i--) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        long number = range == 0
            ? Long.parseLong(sb.toString())
            : Long.parseLong(sb.toString()) * -1;

        if (number > Integer.MAX_VALUE  || number < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) number;
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
