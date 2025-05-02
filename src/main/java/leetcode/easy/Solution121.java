package leetcode.easy;

public class Solution121 {
    public int maxProfit(int[] prices) {
        // 시간복잡도: O(n)
        // 공간복잡도: O(1)

        int result = 0;
        // 가장 저렴한 구매금액을 기억하고 있어야 함
        int minPrice = prices[0];
        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }

            result = Math.max(result, price - minPrice);
        }

        return result;
    }
}
