package programmers.level2.lessons42583

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0

        val bridge: Queue<Int> = LinkedList()
        for (i in 1 .. bridge_length) {
            bridge.add(0)
        }

        val waiting: Queue<Int> = LinkedList()
        truck_weights.forEach { waiting.add(it) }

        while (waiting.isNotEmpty()) {
            bridge.poll()

            // 2. 무게 체크 트럭 이동
            if (weight >= bridge.sum() + waiting.peek()) {
                val truck = waiting.poll()
                bridge.add(truck)
            } else {
                bridge.add(0)
            }

            answer++

            if (waiting.isEmpty()) {
                answer += bridge_length
            }
        }

        return answer
    }
}
