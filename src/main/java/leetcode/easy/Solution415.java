package leetcode.easy;

public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int num1Length = num1.length();
        int num2Length = num2.length();
        int maxLength = Math.max(num1Length, num2Length);
        int index = 0;
        int upper = 0;
        while (index < maxLength) {
            int number = 0;

            if (index < num1Length) {
                number += Integer.valueOf(num1.charAt(num1Length - index - 1) - '0');
            }

            if (index < num2Length) {
                number += Integer.valueOf(num2.charAt(num2Length - index - 1) - '0');
            }

            number += upper;

            if (number > 9) {
                sb.append(number % 10);
                upper = 1;
            } else {
                sb.append(number);
                upper = 0;
            }

            index++;
        }

        if (upper > 0) {
            sb.append(upper);
        }

        return sb.reverse().toString();
    }
}
