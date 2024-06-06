package programmers.level1.lessons12930

class Solution {
    fun solution(s: String): String {
        var answer = ""

        answer = s
            .split(" ")
            .joinToString(" ") { word ->
                word
                    .mapIndexed { index, char ->
                        if (index % 2 == 0) {
                            char.uppercaseChar()
                        } else {
                            char.lowercaseChar()
                        }
                    }
                    .joinToString("")
            }

        return answer
    }
}
