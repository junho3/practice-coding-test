package leetcode.medium;

import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N)

        final Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if ("+".equals(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 + num1);
            } else if ("-".equals(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 - num1);
            } else if ("*".equals(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 * num1);
            } else if ("/".equals(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                stack.push(num2 / num1);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
