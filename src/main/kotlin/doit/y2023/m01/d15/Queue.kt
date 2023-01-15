package doit.y2023.m01.d15

import java.util.LinkedList
import java.util.Queue

class Queue {
    fun queue() {
        val queue: Queue<Int> = LinkedList()

        queue.offer(1)
        queue.offer(4)
        queue.poll()
    }
}
