package programmers.level1.lessons12931

class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        answer = n
            .toString()
            .map { it.digitToInt() }
            .sumOf { it }

        return answer
    }
}
