package leetcode.medium;

import java.util.Stack;

public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            // 소행성이 음수(<-), 양수(->) 순서일 경우 충돌하지 않으므로 고려하지 않아도 됨
            // 소행성이 양수(->), 음수(<-) 순서만 고려하면 됨
            // 따라서 소행성 양수일 때는 무조건 push
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                boolean isAlive = true;
                while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                    int diff = asteroid + stack.peek();

                    if (diff < 0) {
                        stack.pop();
                    } else if (diff > 0) {
                        isAlive = false;
                        break;
                    } else {
                        isAlive = false;
                        stack.pop();
                        break;
                    }
                }

                if (isAlive) {
                    stack.push(asteroid);
                }
            }
        }

        return stack.stream().mapToInt(it -> it).toArray();
    }
}
