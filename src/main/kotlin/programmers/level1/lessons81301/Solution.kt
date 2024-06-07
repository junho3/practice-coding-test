package programmers.level1.lessons81301

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        val words = listOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "night",
        )

        var text = s
        words.forEachIndexed { index, word ->
            text = text.replace(word, index.toString())
        }

        answer = text.toInt()

        return answer
    }
}
