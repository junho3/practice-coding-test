package leetcode.medium;

public class Solution122 {
    public int maxProfit(int[] prices) {
//        [7,1,5,3,6,4]
//        -6 +4 -2 +3 -2 => +4 +3 = 7
//        [1, 3, 100]
//        +2 +97 => +2 +97 = 97 = 100 - 1
        // n - (n - 1) > 0 인 경우만 합산
        int n = prices.length;
        int result = 0;
        for (int i = 1; i < n; i++) {
            int difference = prices[n] - prices[n - 1];
            if (difference > 0) {
                result += difference;
            }
        }

        return result;
    }
}
