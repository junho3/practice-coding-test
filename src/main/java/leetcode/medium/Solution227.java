package leetcode.medium;

import java.util.Stack;

public class Solution227 {
    public int calculate(String s) {
//        Input: s = "3+2*2"
//        Output: 7

//        s = "3*2+2"
//        s = 3+2*2+3
//        s = "42"

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                sb.append(ch);
            }

            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                int number2 = Integer.parseInt(sb.toString());

                if (operator == '*') {
                    int number1 = stack.pop();
                    stack.push(number1 * number2);
                } else if (operator == '/') {
                    int number1 = stack.pop();
                    stack.push(number1 / number2);
                } else if (operator == '-') {
                    stack.push(number2 * -1);
                } else if (operator == '+') {
                    stack.push(number2);
                }

                sb = new StringBuilder();
                operator = ch;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
