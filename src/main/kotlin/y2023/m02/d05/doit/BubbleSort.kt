package y2023.m02.d05.doit

class BubbleSort {
    fun run(numbers: List<Int>): List<Int> {
        val result = numbers.toMutableList()

        for (i in 0 until numbers.size - 1) {
            for (j in 0 until numbers.size - 1 - i) {
                if (result[j] > result[j + 1]) {
                    val tempNumber = result[j]
                    result[j] = result[j + 1]
                    result[j + 1] = tempNumber
                }
            }
        }

        return result
    }
}
