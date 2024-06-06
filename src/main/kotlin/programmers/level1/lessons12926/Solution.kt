package programmers.level1.lessons12926

class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        answer = s.map { char ->
            when (char.code) {
                in 97 .. 122 -> (97 + (char.code + n - 97) % 26).toChar()
                in 65 .. 90 -> (65 + (char.code + n - 65) % 26).toChar()
                else -> " "
            }
        }
            .joinToString("")

        return answer
    }
}
