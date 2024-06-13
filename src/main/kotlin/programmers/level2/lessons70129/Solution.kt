package programmers.level2.lessons70129

class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()

        var text = s
        answer += 0
        answer += 0

        while (true) {
            if (text == "1") {
                break
            }

            answer[0]++
            answer[1] += text
                .filter { it == '0' }
                .length

            text = text
                .filter { it == '1' }
                .length
                .toString(2)
        }

        return answer
    }
}
