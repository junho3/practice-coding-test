package leetcode.medium;

import java.util.List;
import java.util.Stack;

public class Solution150 {

    private final static List<String> OPERATORS = List.of("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (OPERATORS.contains(token)) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                int result = switch (token) {
                    case "+" -> firstNum + secondNum;
                    case "-" -> firstNum - secondNum;
                    case "*" -> firstNum * secondNum;
                    case "/" -> firstNum / secondNum;
                    default -> 0;
                };

                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
