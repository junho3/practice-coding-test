package leetcode.easy;

import java.util.Stack;

public class Solution232 {

    // Stack으로 FIFO Queue를 구현하는 문제
    // push, pop, peek 기능을 구현해야 함

    class MyQueue {

        private final Stack<Integer> inputStack;
        private final Stack<Integer> outputStack;

        public MyQueue() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        public void push(int x) {
            inputStack.push(x);
        }

        public int pop() {
            moveToOutputStack();
            return outputStack.pop();
        }

        public int peek() {
            moveToOutputStack();
            return outputStack.peek();
        }

        public boolean empty() {
            return inputStack.empty() && outputStack.empty();
        }

        private void moveToOutputStack() {
            if (outputStack.empty()) {
                while (!inputStack.empty()) {
                    outputStack.push(inputStack.pop());
                }
            }
        }
    }
}
