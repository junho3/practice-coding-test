package programmers.level2.lessons12951

class Solution {
    fun solution(s: String): String {
        var answer = ""

        answer = s
            .split(" ")
            .joinToString(" ") { word ->
                word.lowercase().replaceFirstChar { it.uppercaseChar() }
            }

        return answer
    }
}
