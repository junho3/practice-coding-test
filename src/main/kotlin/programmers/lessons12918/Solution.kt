package programmers.lessons12918

class Solution {
    fun solution(s: String): Boolean {
        var answer = true

        if (!(s.length == 4 || s.length == 6)) {
            return false
        }

        answer = s.all { it.isDigit() }

        return answer
    }
}
