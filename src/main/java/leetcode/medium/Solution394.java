package leetcode.medium;

import java.util.Stack;

public class Solution394 {

    public String decodeString(String s) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(n)

        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // 숫자일 때 숫자 갱신
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                // 여는 괄호일 때 숫자와 문자열을 stack에 넣고, 초기화
                counts.add(k);
                strings.add(sb.toString());

                k = 0;
                sb = new StringBuilder();
            } else if (ch == ']') {
                // 닫는 괄호일 때 문자열을 이어붙임
                String temp = sb.toString();
                sb = new StringBuilder(strings.pop());
                int count = counts.pop();

                for (int i = 0; i < count; i++) {
                    sb.append(temp);
                }
            } else {
                // 알파벳일 때 StringBuilder에 추가
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
