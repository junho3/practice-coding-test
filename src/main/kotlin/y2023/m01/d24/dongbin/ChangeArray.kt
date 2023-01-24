package y2023.m01.d24.dongbin

class ChangeArray {
    fun run(
        firstNumbers: List<Int>,
        secondNumbers: List<Int>,
        changeCount: Int
    ): List<Int> {
        // 1. firstNumbers를 차례대로 정렬
        val orderedFirstNumbers = firstNumbers.toMutableList()
        for (i in 1 until orderedFirstNumbers.size) {
            for (j in i downTo 1) {
                if (orderedFirstNumbers[j] < orderedFirstNumbers[j - 1]) {
                    val tempNumber = orderedFirstNumbers[j]
                    orderedFirstNumbers[j] = orderedFirstNumbers[j - 1]
                    orderedFirstNumbers[j - 1] = tempNumber
                } else {
                    break
                }
            }
        }

        // 2. secondNumbers를 계수정렬
        val orderedSecondNumbers = IntArray(secondNumbers.max() + 1)
        for (i in secondNumbers.indices) {
            orderedSecondNumbers[secondNumbers[i]]++
        }

        // 3. changeCount 횟수만큼 값 교체
        for (i in 0 until changeCount) {
            loop@ for (j in orderedSecondNumbers.size - 1 downTo 0) {
                if (orderedSecondNumbers[j] > 0) {
                    orderedFirstNumbers[i] = j
                    orderedSecondNumbers[j]--
                    break@loop
                }
            }
        }

        return orderedFirstNumbers
    }

    fun run2(
        firstNumbers: List<Int>,
        secondNumbers: List<Int>,
        changeCount: Int
    ): List<Int> {
        // 1. firstNumbers를 차례대로 정렬
        val orderedFirstNumbers = firstNumbers.toMutableList()
        for (i in 1 until orderedFirstNumbers.size) {
            for (j in i downTo 1) {
                if (orderedFirstNumbers[j] < orderedFirstNumbers[j - 1]) {
                    val tempNumber = orderedFirstNumbers[j]
                    orderedFirstNumbers[j] = orderedFirstNumbers[j - 1]
                    orderedFirstNumbers[j - 1] = tempNumber
                }
            }
        }

        // 2. secondNumbers를 역순서로 정렬
        val orderedSecondNumbers = secondNumbers.toMutableList()
        for (i in 1 until orderedSecondNumbers.size) {
            for (j in i downTo 1) {
                if (orderedSecondNumbers[j] > orderedSecondNumbers[j - 1]) {
                    val tempNumber = orderedSecondNumbers[j]
                    orderedSecondNumbers[j] = orderedSecondNumbers[j - 1]
                    orderedSecondNumbers[j - 1] = tempNumber
                }
            }
        }

        // 3. 교체
        var count = 0
        for (i in orderedFirstNumbers.indices) {
            loop@ for (j in orderedSecondNumbers.indices) {
                if (orderedFirstNumbers[i] < orderedSecondNumbers[j] && count < changeCount) {
                    val tempNumber = orderedFirstNumbers[i]
                    orderedFirstNumbers[i] = orderedSecondNumbers[j]
                    orderedSecondNumbers[j] = tempNumber
                    count++
                    break@loop
                }
            }
        }

        return orderedFirstNumbers
    }
}
