package leetcode.easy;

import java.util.Stack;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(n)

        Stack<Character> stack1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(ch);
            }
        }

        Stack<Character> stack2 = new Stack<>();
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(ch);
            }
        }

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }

        return stack1.size() == stack2.size();
    }
}
