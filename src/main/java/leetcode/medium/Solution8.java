package leetcode.medium;

public class Solution8 {
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
