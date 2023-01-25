package y2023.m01.d25.dongbin

class BinarySearch {
    fun main(numbers: List<Int>, targetNumber: Int): Int {
        var startIndex = 0
        var endIndex = numbers.lastIndex
        var count = 0

        do {
            val middleIndex = startIndex.plus(endIndex).div(2)

            // middleNumber: 8 targetNumber: 4
            if (numbers[middleIndex] > targetNumber) {
                endIndex = middleIndex - 1
            } else if (numbers[middleIndex] < targetNumber) {
                startIndex = middleIndex + 1
            } else {
                startIndex = middleIndex
            }
            count++

            if (numbers[startIndex] == targetNumber) {
                break
            }
        } while (true)

        return count + 1
    }
}
