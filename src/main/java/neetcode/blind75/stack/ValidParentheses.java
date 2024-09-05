package neetcode.blind75.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character peek = stack.peek();
                if (peek == '(' && character == ')') {
                    stack.pop();
                } else if (peek == '{' && character == '}') {
                    stack.pop();
                } else if (peek == '[' && character == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
