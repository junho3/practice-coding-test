package leetcode.easy;

import java.util.List;
import java.util.Stack;

public class Solution20 {

    private final List<Character> OPEN = List.of('(', '[', '{');
    private final List<Character> CLOSE = List.of(')', ']', '}');

    public boolean isValid(String s) {

        // 시간복잡도: O(n)
        // 공간복잡도: O(n)
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (OPEN.contains(ch)) {
                stack.add(ch);
                continue;
            }

            if (CLOSE.contains(ch) && !stack.isEmpty()) {
                char stackChar = stack.peek();

                if (
                    (ch == ')' && stackChar == '(')
                    || (ch == ']' && stackChar == '[')
                    || (ch == '}' && stackChar == '{')
                ) {
                    stack.pop();
                    continue;
                }
            }

            return false;
        }

        return stack.isEmpty();
    }
}
