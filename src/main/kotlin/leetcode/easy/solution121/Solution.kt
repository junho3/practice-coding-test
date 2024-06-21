package leetcode.easy.solution121

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPriceIndex = 0
        var difference = 0
        prices.forEachIndexed { index, price ->
            difference = max(difference, price - prices[minPriceIndex])

            if (price < prices[minPriceIndex]) {
                minPriceIndex = index
            }
        }

        return difference
    }
}
