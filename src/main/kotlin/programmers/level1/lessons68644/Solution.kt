package programmers.level1.lessons68644

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                answer += numbers[i] + numbers[j]
            }
        }

        return answer
            .distinctBy { it }
            .sorted()
            .toIntArray()
    }
}
