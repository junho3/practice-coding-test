package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Solution225 {
    class MyStack {

        private Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);

            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    class MyStack2 {

        private final Queue<Integer> queue1;
        private final Queue<Integer> queue2;
        private int queueNumber;

        public MyStack2() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
            queueNumber = 1;
        }

        public void push(int x) {
            if (queueNumber == 1) {
                queue1.add(x);
            } else {
                queue2.add(x);
            }
        }

        public int pop() {
            if (queueNumber == 1) {
                while (queue1.size() > 1) {
                    queue2.add(queue1.poll());
                }

                queueNumber = 2;

                return queue1.poll();
            } else {
                while (queue2.size() > 1) {
                    queue1.add(queue2.poll());
                }

                queueNumber = 1;

                return queue2.poll();
            }
        }

        public int top() {
            if (queueNumber == 1) {
                while (queue1.size() > 1) {
                    queue2.add(queue1.poll());
                }

                queueNumber = 2;

                int temp = queue1.peek();
                queue2.add(queue1.poll());

                return temp;
            } else {
                while (queue2.size() > 1) {
                    queue1.add(queue2.poll());
                }

                queueNumber = 1;

                int temp = queue2.peek();
                queue1.add(queue2.poll());

                return temp;
            }
        }

        public boolean empty() {
            if (queueNumber == 1) {
                return queue1.isEmpty();
            } else {
                return queue2.isEmpty();
            }
        }
    }
}
