package programmers.level2.lessons12945

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val map: MutableMap<Int, Int> = mutableMapOf()

        for (i in 0 .. n) {
            if (i <= 1) {
                map[i] = i
            } else {
                map[i] = map[i - 1]!! + map[i - 2]!!
            }
        }
        answer = map[n]!!

        return answer
    }
}
