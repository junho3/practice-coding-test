package y2023.m01.d31.doit

import java.util.*
import kotlin.math.abs

class AbsoluteValueHeap {
    fun run(numbers: List<Int>): List<Int> {
        val queue = PriorityQueue<Int> { number1, number2 ->
            val absNumber1 = abs(number1)
            val absNumber2 = abs(number2)

            if (absNumber1 == absNumber2) {
                if (number1 > number2) {
                    1 // number1이 number2보다 크기 때문에 1
                } else {
                    -1 // number1이 number2보다 작기 때문에 -1
                }
            } else {
                absNumber1.compareTo(absNumber2)
            }
        }

        val result = mutableListOf<Int>()
        numbers.forEach {
            if (it == 0) { // 숫자가 0이라면
                if (queue.isEmpty()) { // 큐가 비었다면 0을 추가
                    result.add(0)
                } else { // 배열에서 절대값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거
                    result.add(queue.poll())
                }
            } else { // 숫자가 0이 아니라면 배열에 숫자를 추가
                queue.add(it)
            }
        }

        return result
    }
}
