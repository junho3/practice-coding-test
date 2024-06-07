package programmers.level1.lessons76501

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        absolutes.forEachIndexed { index, i ->
            if (signs[index]) {
                answer += i
            } else {
                answer += (i * -1)
            }
        }

        return answer
    }
}
