package leetcode.easy;

public class Solution374 {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        int number = start + (end - start) / 2;
        while (start < end) {
            int result = guess(number);

            if (result == -1) {
                end = number - 1;
            } else if (result == 1) {
                start = number + 1;
            } else {
                break;
            }

            number = start + (end - start) / 2;
        }

        return number;
    }

    private int guess(int n) {
        return 0;
    }
}
