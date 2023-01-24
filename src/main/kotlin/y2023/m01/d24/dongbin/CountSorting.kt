package y2023.m01.d24.dongbin

class CountSorting {
    fun run(numbers: List<Int>): List<Int> {
        val tempNumbers = IntArray(numbers.size).toMutableList()

        for (i in numbers.indices) {
            tempNumbers[numbers[i]]++
        }

        val result = mutableListOf<Int>()
        tempNumbers.forEachIndexed { index, tempNumber ->
            for (i in 0 until tempNumber) {
                result.add(index)
            }
        }

        return result
    }
}
