package programmers.level2.lessons12949

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()

        val rowsA = arr1.size
        val colsA = arr1[0].size
        val colsB = arr2[0].size

        answer = Array(rowsA) { IntArray(colsA) { 0 } }

        for (i in 0 until rowsA) {
            for (j in 0 until colsB) {
                for (k in 0 until colsA) {
                    answer[i][k] = arr1[i][k] + arr2[k][j]
                }
            }
        }

        return answer
    }
}
