package doit.y2023.m01.d14

class SumOfNumber {
    fun sumOfNumber(input: String): Int {
        return input.toCharArray()
            .sumOf { it.digitToInt() }
    }
}
