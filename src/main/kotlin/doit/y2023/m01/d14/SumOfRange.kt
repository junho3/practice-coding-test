package doit.y2023.m01.d14

class SumOfRange {
    fun sumOfRange(numbers: List<Int>, fromIndex: Int, toIndex: Int): Int {
        // numbers 배열에 있는 숫자 값 기준으로 fromIndex ~ toIndex 까지 합을 구한다.

        // 합배열을 구한다.
        val summaryNumbers = mutableListOf<Int>()
        numbers.forEachIndexed { index, number ->
            when (index) {
                0 -> summaryNumbers.add(number)
                else -> summaryNumbers.add(number.plus(summaryNumbers[index - 1]))
            }
        }

        // 합배열에서 fromIndex ~ toIndex 범위를 계산한다.
        return when {
            fromIndex - 1 < 0 -> summaryNumbers[toIndex]
            else -> summaryNumbers[toIndex].minus(summaryNumbers[fromIndex - 1])
        }
    }
}
