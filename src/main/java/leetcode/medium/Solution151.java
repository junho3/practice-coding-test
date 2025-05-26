package leetcode.medium;

import java.util.Stack;

public class Solution151 {
    public String reverseWords(String s) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N)

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (!sb.isEmpty()) {
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(ch);
            }
        }

        if (!sb.isEmpty()) {
            stack.push(sb.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
