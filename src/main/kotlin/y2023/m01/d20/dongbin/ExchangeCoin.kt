package y2023.m01.d20.dongbin

class ExchangeCoin(
    private val coins: List<Int>
) {
    fun exchange(money: Int): Int {
        var restMoney = money

        return coins.sortedDescending()
            .fold(0) { result, coin ->
                val count = restMoney / coin
                restMoney -= (coin * count)
                result + count
            }
    }
}
