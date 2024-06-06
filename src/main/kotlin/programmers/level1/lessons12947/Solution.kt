package programmers.level1.lessons12947

class Solution {
    fun solution(x: Int): Boolean {
        var answer = true

        val sum = x.toString().sumOf { it.digitToInt() }

        if (x % sum != 0) {
            answer = true
        }

        return answer
    }
}
