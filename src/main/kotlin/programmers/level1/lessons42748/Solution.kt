package programmers.level1.lessons42748

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        answer = commands.map {
            val i = it[0] - 1
            val j = it[1] - 1
            val k = it[2] - 1

            array
                .slice(i..j)
                .sorted()[k]
        }
            .toIntArray()

        return answer
    }
}
