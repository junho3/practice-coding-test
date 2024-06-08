package programmers.level2.lessons42587

import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0

        val queues: Queue<Pair<Int, Boolean>> = LinkedList()
        val priorityQueue: PriorityQueue<Int> = PriorityQueue(Collections.reverseOrder())
        priorities.forEachIndexed { index, i ->
            queues.add(Pair(i, index == location))
            priorityQueue.add(i)
        }

        while (true) {
            val queue = queues.poll()
            if (queue.first == priorityQueue.peek()) {
                priorityQueue.poll()
                answer++
                if (queue.second) {
                    break
                }
            } else {
                queues.add(queue)
            }
        }

        return answer
    }
}
