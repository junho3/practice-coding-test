package leetcode.medium;

import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        // 시간복잡도 O(n log k)
        // 공간복잡도 O(n)
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Double.compare(getDistance(a), getDistance(b)));

        for (int[] point : points) {
            queue.add(point);
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }

    private double getDistance(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }
}
