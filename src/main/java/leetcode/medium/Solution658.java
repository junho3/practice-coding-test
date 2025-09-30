package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // [거리, 숫자]
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(b[0], a[0]); // 거리가 가까운 것
                }
                return Integer.compare(b[1], a[1]); // 숫자가 작은 것
            }
        );

        for (int j : arr) {
            queue.add(new int[]{Math.abs(j - x), j});

            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll()[1]);
        }
        Collections.sort(result);

        return result;
    }
}
