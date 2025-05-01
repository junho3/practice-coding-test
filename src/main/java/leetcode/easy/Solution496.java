package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums2에서 타겟 숫자보다 더 큰 다음 숫자를 기록하는 Map
        // <num2, nextGreaterNum2>
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // 시간 복잡도 O(N)
        // 공간 복잡도 O(N)
        for (int num2 : nums2) {
            while (!stack.isEmpty() && num2 > stack.peek()) {
                int prev = stack.pop();
                map.put(prev, num2);
            }
            stack.push(num2);
        }

        // 시간 복잡도 O(M)
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        // 최종 시간 복잡도 O(N + M)
        // 공간 복잡도 O(N)

        return result;
    }
}
