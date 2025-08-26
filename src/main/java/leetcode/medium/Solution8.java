package leetcode.medium;

import java.util.List;

public class Solution8 {

    public int myAtoi_divided_and_conquer(String s) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int index = 0;
        int length = s.length();

        // 1. 선행 공백은 무시
        while (index < length) {
            if (s.charAt(index) == ' ') {
                index++;
            } else {
                break;
            }
        }

        // 2. +- 부호 존재 (없을 경우 양수)
        int sign = 1;
        if (index < length && List.of('+', '-').contains(s.charAt(index))) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // 3. 문자가 발견되면 종료
        long result = 0;
        while (index < length) {
            if (Character.isDigit(s.charAt(index))) {
                result = (result * 10) + s.charAt(index) - '0';

                // 4. 범위 초과 처리
                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                index++;
            } else {
                break;
            }
        }

        return (int) result * sign;
    }

    public int myAtoi(String s) {
        // 공백 무시 (처음부터 공백 스킵)
        // 부호 처리 (+ 또는 -)
        // 숫자 추출 (0~9)
        // 비숫자 등장 시 중단
        // 32비트 정수 범위로 자르기:

        // 시간복잡도 O(n)
        // 공간복잡도 O(1)

        long result = 0;
        int sign = 1;
        boolean isSetResult = false;
        boolean isSetSign = false;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (isSetResult || isSetSign) {
                    break;
                }
                continue;
            }

            if (ch == '+' || ch == '-') {
                if (isSetResult || isSetSign) {
                    break;
                }

                sign = ch == '+' ? 1 : -1;
                isSetSign = true;
                continue;
            }

            if (Character.isDigit(ch)) {
                result = result * 10 + (ch - '0');
                isSetResult = true;
            } else {
                break;
            }

            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) result * sign;
    }
}
