package leetcode.medium;

import java.util.Stack;

public class Solution71 {
    public String simplifyPath(String path) {
//        Input: path = "/home/"
//        Output: "/home"

        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String word : paths) {
            if ("..".equals(word)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!word.isEmpty() && !".".equals(word)) {
                stack.push(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(String.join("/", stack));

        return sb.toString();
    }
}
