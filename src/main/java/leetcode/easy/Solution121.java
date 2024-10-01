package leetcode.easy;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // prices = [7,1,5,3,6,4]
        // 5: 6 - 1 >> day2 1에 사서 day5 6에 판다

        int result = 0;
        // 가장 저렴한 구매금액을 기억하고 있어야 함
        int minBuyPrice = prices[0];
        for (int i = 1; i < n; i++) {
            if (minBuyPrice > prices[i]) {
                minBuyPrice = prices[i];
            }

            result = Math.max(result, prices[i] - minBuyPrice);
        }

        return result;
    }
}
