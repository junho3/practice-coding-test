package y2023.m01.d30.doit

import java.util.*

class FindOBigNumber {
    fun run(numbers: List<Int>): List<Int> {
        val results = IntArray(numbers.size)
        val stack = Stack<Int>()

        stack.push(0)

        for (i in 1 until numbers.size) {
            while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
                results[stack.pop()] = numbers[i]
            }
            stack.push(i)
        }

        while (stack.isNotEmpty()) {
            results[stack.pop()] = -1
        }

        return results.toList()
    }
}
