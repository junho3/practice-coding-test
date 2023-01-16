package y2023.m01.d15.dongbin

import java.util.Stack

class Stack {
    fun stack() {
        val stack = Stack<Int>()

        stack.push(5)
        stack.push(3)
        stack.pop()
        stack.push(10)
        stack.push(2)
        stack.pop()
    }
}
