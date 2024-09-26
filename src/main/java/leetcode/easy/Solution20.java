package leetcode.easy;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        // "()[]{}"
        // ")(){}"
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char ch = stack.pop();

                if (c == ']' && ch != '[') {
                    return false;
                } else if (c == ')' && ch != '(') {
                    return false;
                } else if (c == '}' && ch != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
