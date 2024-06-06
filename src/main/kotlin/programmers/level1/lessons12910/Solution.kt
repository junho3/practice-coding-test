package programmers.level1.lessons12910

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        answer = arr.filter { it % divisor == 0 }
            .map { it }
            .sorted()
            .toIntArray()

        if (answer.size == 0) {
            return intArrayOf(-1)
        }

        return answer
    }
}
