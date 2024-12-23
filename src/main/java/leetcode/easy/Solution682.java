package leetcode.easy;

import java.util.Stack;

public class Solution682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first + second);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.valueOf(operation));
                    break;
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
