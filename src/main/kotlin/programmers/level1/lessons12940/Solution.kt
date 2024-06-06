package programmers.level1.lessons12940

class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()

        answer = intArrayOf(gcd(n, m), ((n * m) / gcd(n, m)))

        return answer
    }

    fun gcd(n: Int, m: Int): Int {
        if (m > n) {
            return if (n == 0) m else gcd(n, m % n)
        } else {
            return if (m == 0) n else gcd(n % m, m)
        }
    }
}
