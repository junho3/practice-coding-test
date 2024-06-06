package programmers.level1.lessons12935

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()

        val min = arr.minOf { it }
        answer = arr
            .filter { it > min }
            .toIntArray()

        if (answer.isEmpty()) {
            return intArrayOf(-1)
        }

        return answer
    }
}
