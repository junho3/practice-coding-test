package programmers.level1.lessons42889

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()

        val failRate: MutableMap<Int, Double> = mutableMapOf()
        for (stageNumber in 1..N) {
            val joinCount = stages.filter { it >= stageNumber }.size
            val failCount = stages.filter { it <= stageNumber }.size

            if (failCount == 0) {
                failRate[stageNumber] = 0.0
            } else {
                failRate[stageNumber] = (failCount / joinCount).toDouble()
            }
        }

        answer = failRate.toList().sortedByDescending { it.second }.map { it.first }.toIntArray()

        return answer
    }
}
