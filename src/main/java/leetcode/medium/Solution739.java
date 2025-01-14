package leetcode.medium;

import java.util.Stack;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        // 1. temperatures 순회
        // 2. temperatures[i] 온도와 temperatures[stack] 온도 비교
        // 3. temperatures[i] > temperatures[stack]이면 pop, result 갱신
        // 4. temperatueres[i] <= temperatures[stack]이면 종료

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()) {
                if (temperatures[i] > temperatures[stack.peek()]) {
                    int index = stack.pop();
                    result[index] = i - index;
                } else {
                    break;
                }
            }

            stack.push(i);
        }

        return result;
    }
}
