package programmers.level1.lessons82612

import kotlin.math.abs

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1

        var totalPrice: Long = 0
        for (i in 1..count) {
            totalPrice += price * i
        }

        if (money - totalPrice > 0) {
            answer = 0
        } else {
            answer = abs(money - totalPrice)
        }

        return answer
    }
}
