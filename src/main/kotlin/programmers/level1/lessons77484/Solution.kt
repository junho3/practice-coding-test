package programmers.level1.lessons77484

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        // 0의 개수
        val unknownNumberCount = lottos.count { it == 0 }

        var matchedNumberCount = 0
        lottos
            .filter { it != 0}
            .forEach { lotto ->
                win_nums.forEach { win_num ->
                    if (lotto == win_num) {
                        matchedNumberCount++
                    }
                }
            }

        answer += when(matchedNumberCount + unknownNumberCount) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            else -> 6
        }

        answer += when(matchedNumberCount) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            else -> 6
        }

        return answer
    }
}
