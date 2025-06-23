package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution542 {

    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        // 시간복잡도 O(M * N)
        // 공간복잡도 O(M * N)

        int rLength = mat.length;
        int cLength = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int r = 0; r < rLength; r++) {
            for (int c = 0; c < cLength; c++) {
                if (mat[c][r] == 0) {
                    queue.offer(new int[]{c, r});
                } else {
                    mat[c][r] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            int r = location[0];
            int c = location[1];

            for (int[] direction : DIRECTIONS) {
                int newR = r + direction[0];
                int newC = c + direction[1];

                if (
                    newR >= 0
                    && newC >= 0
                    && newR < rLength
                    && newC < cLength
                    && mat[newR][newC] == -1
                ) {
                    queue.offer(new int[]{newR, newC});
                    mat[newR][newC] = mat[r][c] + 1;
                }
            }
        }

        return mat;
    }
}
