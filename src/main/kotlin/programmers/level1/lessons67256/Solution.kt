package programmers.level1.lessons67256

import kotlin.math.abs

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""

        val handLocation = mutableListOf(10, 12)
        val keyPad: List<List<Int>> = listOf(
            listOf(1, 4, 7, 10),
            listOf(2, 5, 8, 11),
            listOf(3, 6, 9, 12),
        )

        numbers.forEach { number ->
            if (keyPad[0].contains(number)) {
                answer += "L"
                handLocation[0] = number
            } else if (keyPad[2].contains(number)) {
                answer += "R"
                handLocation[1] = number
            } else {
                val convertedNumber = if (number == 0) { 11 } else { number }

                val leftHandDistance = (abs(handLocation[0] - convertedNumber) / 3) + (abs(handLocation[0] - convertedNumber) % 3)
                val rightHandDistance = (abs(handLocation[1] - convertedNumber) / 3) + (abs(handLocation[1] - convertedNumber) % 3)

                if (leftHandDistance > rightHandDistance) {
                    answer += "R"
                    handLocation[1] = convertedNumber
                } else if (leftHandDistance < rightHandDistance) {
                    answer += "L"
                    handLocation[0] = convertedNumber
                } else {
                    if (hand == "right") {
                        answer += "R"
                        handLocation[1] = convertedNumber
                    } else {
                        answer += "L"
                        handLocation[0] = convertedNumber
                    }
                }
            }
        }

        return answer
    }
}
