package y2023.m01.d29.doit

class FindGoodNumber {
    fun run(numbers: List<Int>): Int {
        var count = 0

        numbers.forEachIndexed { index, number ->
            var startIndex = 0
            var endIndex = numbers.lastIndex

            while (startIndex < endIndex) {
                if (numbers[startIndex].plus(numbers[endIndex]) == number) {
                    if (startIndex != index && endIndex != index) {
                        count++
                        break
                    } else if (startIndex == index) {
                        startIndex++
                    } else if (endIndex == index) {
                        endIndex++
                    }
                } else if (numbers[startIndex].plus(numbers[endIndex]) < number) {
                    startIndex++
                } else {
                    endIndex--
                }
            }
        }

        return count
    }
}
