package programmers.level2.lessons12939

class Solution {
    fun solution(s: String): String {
        var answer: String = ""

        val numbers = s
            .split(" ")
            .map { it.toInt() }

        answer = "${numbers.minOf { it }} ${numbers.maxOf { it }} "

        return answer
    }
}
