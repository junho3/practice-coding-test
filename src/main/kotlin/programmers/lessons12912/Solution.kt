package programmers.lessons12912

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        val start = minOf(a, b)
        val end = maxOf(a, b)

        for (i in start .. end) {
            answer += i
        }

        return answer
    }
}
