package y2023.m01.d24.dongbin

class InsertSorting {
    fun run(numbers: List<Int>): List<Int> {
        val result = numbers.toMutableList()

        for (i in 1 until result.size) {
            for (j in i downTo 1) {
//                  7, 5, 9, 0, 3, 1, 6, 2, 4, 8
//
                if (result[j] < result[j - 1]) {
                    val minNumber = result[j]
                    result[j] = result[j - 1]
                    result[j - 1] = minNumber
                } else {
                    break
                }
            }
        }

        return result
    }
}
