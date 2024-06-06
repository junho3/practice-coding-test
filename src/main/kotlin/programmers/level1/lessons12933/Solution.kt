package programmers.level1.lessons12933

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0

        answer = n
            .toString()
            .map { it }
            .sortedDescending()
            .joinToString("")
            .toLong()

        return answer
    }
}
