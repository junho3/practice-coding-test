package programmers.level1.lessons12917

class Solution {
    fun solution(s: String): String {
        var answer = ""

        answer = s.toCharArray().sortedArrayDescending().concatToString()

        return answer
    }
}
