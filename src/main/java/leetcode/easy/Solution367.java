package leetcode.easy;

public class Solution367 {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        boolean isSquare = false;
        while (start <= end) {
            // (start + end) / 2가 안되는 이유는 overflow가 발생하여 결과값이 음수로 나옴
            // ex) 2147483647가 주어졌을 때 int로 계산하면 -1073741824로 나옴
            long mid = start + (end - start) / 2;
            // 제곱했을 때 int보다 큰수가 발생하여 - 값이 발생하면서 timelimit 발생
            long square = mid * mid;

            if (square > num) {
                end = mid - 1;
            } else if (square < num) {
                start = mid + 1;
            } else {
                isSquare = true;
                break;
            }
        }

        return isSquare;
    }
}
//1 ~ 25
//
//
//26 / 2;   25 < 13 * 13 > end를 13 - 1
//
//1 ~ 12 > 13
