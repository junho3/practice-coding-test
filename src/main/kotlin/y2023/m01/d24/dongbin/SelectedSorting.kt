package y2023.m01.d24.dongbin

class SelectedSorting {
    fun run(numbers: List<Int>): List<Int> {
        val result = numbers.toMutableList()

        for (i in result.indices) {
            var minIndex = i
            for (j in i + 1 until result.size) {
                if (result[j] < result[minIndex]) {
                    minIndex = j
                }
            }

            val minNumber = result[minIndex]
            result[minIndex] = result[i]
            result[i] = minNumber
        }

        return result
    }
}
