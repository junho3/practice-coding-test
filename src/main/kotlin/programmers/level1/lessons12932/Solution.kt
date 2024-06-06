package programmers.level1.lessons12932

class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()

        answer = n
            .toString()
            .map { it.digitToInt() }
            .reversed()
            .toIntArray()

        return answer
    }
}
