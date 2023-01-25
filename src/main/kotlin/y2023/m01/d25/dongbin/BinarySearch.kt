package y2023.m01.d25.dongbin

class BinarySearch {
    fun main(numbers: List<Int>, targetNumber: Int): Int {
        var startIndex = 0
        var endIndex = numbers.lastIndex
        var count = 0

        do {
            val middleIndex = startIndex.plus(endIndex).div(2)
            val middleNumber = numbers[middleIndex]

            // middleNumber: 8 targetNumber: 4
            if (middleNumber > targetNumber) {
                endIndex = middleIndex - 1
            } else if (middleNumber < targetNumber) {
                startIndex = middleIndex + 1
            } else {
                startIndex = middleIndex
            }
            count++

            val startNumber = numbers[startIndex]
            if (startNumber == targetNumber) {
                break
            }
        } while (true)

        return count + 1
    }
}
