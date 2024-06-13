package programmers.level2.lessons12953

class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0

        answer = arr[0]

        arr.forEach{
            val g = gcd(answer, it)
            answer = (answer * it) / g
        }

        return answer
    }

    fun gcd(a: Int, b: Int): Int {
        val r = a % b
        if (r == 0) {
            return b
        }
        return gcd(b, r)
    }
}
