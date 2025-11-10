package leetcode.medium;

public class Solution43 {

    // 두 개의 숫자로 구성된 문자열이 주어졌을 때 곱셈 결과를 리턴

    public String multiply(String num1, String num2) {

        // 시간복잡도 O(N * M)
        // 공간복잡도 O(N + M)

        int n = num1.length();
        int m = num2.length();
        int[] numbers = new int[n + m]; // 각 자리 수를 보관할 배열

        for (int i = n - 1; i >= 0; i--) {

            int number1 = num1.charAt(i) - '0';

            for (int j = m - 1; j >= 0; j--) {

                int number2 = num2.charAt(j) - '0';

                int multiply = number1 * number2;

                int carryIndex = i + j;
                int numberIndex = i + j + 1;

                int sum = numbers[numberIndex] + multiply;

                numbers[carryIndex] += sum / 10;
                numbers[numberIndex] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (sb.isEmpty() && number == 0) {
                continue;
            }

            sb.append(number);
        }

        if (sb.isEmpty()) {
            return "0";
        }

        return sb.toString();
    }
}
