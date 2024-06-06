package programmers.level1.lessons12954

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()

        for (i in 1 .. n) {
            answer += i.toLong() * x.toLong()
        }

        return answer
    }
}
