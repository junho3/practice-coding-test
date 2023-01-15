package doit.y2023.m01

class SumOfRest {
    fun sumOfRest(numbers: List<Int>, remainder: Int): List<Int> {
        val summaryNumbers = mutableListOf<Int>()
        numbers.forEachIndexed { index, number ->
            when (index) {
                0 -> summaryNumbers.add(number)
                else -> summaryNumbers.add(number.plus(summaryNumbers[index - 1]))
            }
        }

        val remainderNumbers = summaryNumbers.map { it.mod(remainder) }

        // TODO 나머지 부분을 이해하지 못 함

        return remainderNumbers
    }
}
