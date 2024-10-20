package leetcode.medium;

import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
//        Input: tokens = ["2","1","+","3","*"]
//        Output: 9
//        Explanation: ((2 + 1) * 3) = 9

        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            String token = tokens[i];

            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                int first = stack.pop();
                int second = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(second + first);
                        break;
                    case "-":
                        stack.push(second - first);
                        break;
                    case "*":
                        stack.push(second * first);
                        break;
                    case "/":
                        stack.push(second / first);
                        break;
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
