package doit.y2023.m01

fun sumOfNumber(input: String): Int {
    return input.toCharArray()
        .sumOf { it.digitToInt() }
}
