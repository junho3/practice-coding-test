package programmers.level2.lessons42586

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()

        val queues: Queue<Pair<Int, Int>> = LinkedList()
        progresses.forEachIndexed { i, progress -> queues.add(Pair(progress, speeds[i])) }

        while (queues.isNotEmpty()) {
            var completeCount = 0
            var isComplete = false
            for (index in queues.indices) {
                val queue = queues.poll()
                val newProgress = queue.first + queue.second

                if (index == 0) {
                    if (newProgress >= 100) {
                        isComplete = true
                        completeCount++
                    } else {
                        queues.add(Pair(newProgress, queue.second))
                    }
                } else {
                    if (newProgress >= 100 && isComplete) {
                        completeCount++
                    } else {
                        queues.add(Pair(newProgress, queue.second))
                        isComplete = false
                    }
                }

                if (completeCount > 0) {
                    answer += completeCount
                }
            }
        }

        answer += answer

        return answer
    }
}
