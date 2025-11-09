package leetcode.medium;

import java.util.Stack;

public class Solution394 {

    public String decodeString(String s) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(n)

        int n = s.length();

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) { // 1. 숫자인 경우
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(sb.toString());

                count = 0;
                sb = new StringBuilder();
            } else if (ch == ']') {
                String tempString = sb.toString();
                sb = new StringBuilder(stringStack.pop());
                int tempCount = countStack.pop();

                for (int j = 0; j < tempCount; j++) {
                    sb.append(tempString);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
