package programmers.level1.lessons12950

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()

        arr1.forEachIndexed { x, ints ->
            val result = mutableListOf<Int>()

            ints.forEachIndexed { y, int ->
                result.add(int + arr2[x][y])
            }

            answer += result.toIntArray()
        }

        return answer
    }
}
