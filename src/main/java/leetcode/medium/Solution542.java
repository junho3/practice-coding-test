package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution542 {

    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        int yLength = mat.length;
        int xLength = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int y = 0; y < yLength; y++) {
            for (int x = 0; x < xLength; x++) {
                if (mat[y][x] == 0) {
                    queue.offer(new int[]{y, x});
                } else {
                    mat[y][x] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            int y = location[0];
            int x = location[1];

            for (int[] direction : DIRECTIONS) {
                int newY = y + direction[0];
                int newX = x + direction[1];

                if (
                    newX >= 0
                    && newX < xLength
                    && newY >= 0
                    && newY < yLength
                    && mat[newY][newX] == -1
                ) {
                    mat[newY][newX] = mat[y][x] + 1;
                    queue.offer(new int[]{newY, newX});
                }
            }
        }

        return mat;
    }
}
