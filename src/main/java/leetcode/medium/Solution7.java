package leetcode.medium;

public class Solution7 {
    public int reverse(int x) {
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
}
