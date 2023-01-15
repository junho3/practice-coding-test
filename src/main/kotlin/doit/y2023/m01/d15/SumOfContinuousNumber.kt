package doit.y2023.m01

class SumOfContinuousNumber {
    fun sumOfContinuousNumber(number: Int): Int {
        var count = 1
        var startIndex = 1
        var endIndex = 1
        var sum = 1

        do {
            when {
                sum == number -> {
                    count++
                    endIndex++
                    sum += endIndex
                }

                sum > number -> {
                    sum -= startIndex
                    startIndex++
                }

                else -> {
                    endIndex++
                    sum += endIndex
                }
            }
        } while (endIndex != number)

        return count
    }
}
