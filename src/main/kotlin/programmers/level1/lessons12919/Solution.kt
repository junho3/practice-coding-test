package programmers.level1.lessons12919

class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""

        val index = seoul.indexOfFirst { it == "Kim" }
        answer = "김서방은 ${index}에 있다"

        return answer
    }
}
