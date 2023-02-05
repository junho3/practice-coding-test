package y2023.m02.d05.doit

class SelectSort {
    fun run(text: String): List<Int> {
        val numbers = text.map { it.digitToInt() }
            .toMutableList()

        for (i in numbers.indices) {
            var minIndex = i
            for (j in i + 1 until numbers.size) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j
                }
            }

            val tempNumber = numbers[minIndex]
            numbers[minIndex] = numbers[i]
            numbers[i] = tempNumber
        }

        return numbers
    }
}
