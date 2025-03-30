package leetcode.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingDouble(p -> Math.sqrt(p[0] * p[0] + p[1] * p[1])));

        for (int[] point : points) {
            queue.add(point);
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }
}
