package y2023.m01.d30.doit

import java.util.*

class CardGame {
    fun run(count: Int): Int {
        val queue: Queue<Int> = LinkedList()

        for (i in 1..count) {
            queue.add(i)
        }

        while (queue.size > 1) {
            queue.poll()
            queue.add(queue.poll())
        }

        return queue.poll()
    }
}
