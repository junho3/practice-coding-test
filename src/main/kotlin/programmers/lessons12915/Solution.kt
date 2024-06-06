package programmers.lessons12915

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        strings
            .sorted()
            .sortedBy { it[n] }
            .forEach { answer += it }

        return answer
    }
}
