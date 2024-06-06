package programmers.level1.lessons42840

class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        val first = listOf(1 ,2, 3, 4, 5)
        val second = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val third = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val result = mutableListOf<Int>()

        answers.forEachIndexed { index, it ->
            val firstIndex = (index + first.size) % first.size
            if (it == first[firstIndex]) {
                result.add(1)
            }

            val secondIndex = (index + second.size) % second.size
            if (it == second[secondIndex]) {
                result.add(2)
            }

            val thirdIndex = (index + third.size) % third.size
            if (it == third[thirdIndex]) {
                result.add(3)
            }
        }

        val max = result
            .groupBy { it }
            .maxOf { it.value.size }

        answer = result
            .groupBy { it }
            .filter { it.value.size == max }
            .map { it.key }
            .sorted()
            .toIntArray()

        return answer
    }
}
