package y2023.m01.d14.doit

class SumOfNumber {
    fun sumOfNumber(input: String): Int {
        return input.toCharArray()
            .sumOf { it.digitToInt() }
    }
}
