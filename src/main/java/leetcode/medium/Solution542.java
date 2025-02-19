package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution542 {

    private static final int[][] MOVES = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        // 1. BFS
        // 2-2. 0으로 된 부분은 큐에 담음 Queue<int[r,c]>
        // 2-2. 1로 된 부분을 NAN으로 변경
        // 3. 큐를 돌면서 int[r][c] 기준으로 상하좌우 체크
        // 4. int[r][c] 값보다 큰 곳이 있으면 int[newR][newC] = int[r][c] + 1;
        // 5. int[newR][newC] 큐에 담음

        int maxRow = mat.length;
        int maxCol = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                if (mat[r][c] == 0) {
                    queue.add(new int[]{r , c});
                } else {
                    mat[r][c] = Integer.MAX_VALUE;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            int row = location[0];
            int col = location[1];

            for (int[] move : MOVES) {
                int newRow = row + move[0];
                int newCol = col + move[1];

                if (
                    newRow >= 0
                    && newRow < maxRow
                    && newCol >= 0
                    && newCol < maxCol
                    && mat[newRow][newCol] > mat[row][col]
                ) {
                    mat[newRow][newCol] = mat[row][col] + 1;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        return mat;
    }
}
