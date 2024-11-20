package leetcode.easy;

public class Solution258 {
    public int addDigits(int num) {
        String text = String.valueOf(num);

        while (text.length() > 1) {
            int length = text.length();
            int sum = 0;

            for (int i = 0; i < length; i++) {
                sum += text.charAt(i) - '0';
            }

            text = String.valueOf(sum);
        }

        return Integer.parseInt(text);
    }
}
