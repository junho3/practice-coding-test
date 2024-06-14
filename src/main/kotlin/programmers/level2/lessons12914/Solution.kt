package programmers.level2.lessons12914

class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0

        val numbers = IntArray(n + 1)
        numbers[0] = 1
        numbers[1] = 1

        for (i in 2 .. n) {
            numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 1234567
        }

        answer = numbers[n].toLong()

        return answer
    }
}
