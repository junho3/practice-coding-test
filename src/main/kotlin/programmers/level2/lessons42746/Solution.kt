package programmers.level2.lessons42746

class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""

        val strings = numbers
            .map { it.toString() }
            .sortedWith { o1, o2 -> (o2 + o1).toInt().compareTo((o1 + o2).toInt()) }

        if (strings[0] == "0") {
            answer = "0"
        } else {
            answer = strings.joinToString("")
        }

        return answer
    }
}
