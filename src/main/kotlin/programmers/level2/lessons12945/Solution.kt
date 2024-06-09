package programmers.level2.lessons12945

class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        answer = (fibonacci(n) % 1234567).toInt()

        return answer
    }

    private fun fibonacci(n: Int): Long {
        if (n <= 1) {
            return n.toLong()
        }

        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}
