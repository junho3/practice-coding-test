package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution994 {

    private static final int[][] DIRECTIONS = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static Integer ROWS;
    private static Integer COLS;

    public int orangesRotting(int[][] grid) {
        // 시간복잡도 O(N * M)
        // 공간복잡도 O(N * M)

        ROWS = grid.length;
        COLS = grid[0].length;

        final Queue<int[]> queue = new LinkedList<>();

        int freshCount = 0;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[] {r,c});
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }

        if (freshCount == 0) {
            return 0;
        }

        int time = -1; // 처음에는 썩은 오렌지만 있으므로 초기값 -1
        while (!queue.isEmpty()) {
            final int length = queue.size();

            for (int i = 0; i < length; i++) {
                final int[] rotten = queue.poll();
                final int row = rotten[0];
                final int col = rotten[1];

                for (int[] direction : DIRECTIONS) {
                    final int newRow = row + direction[0];
                    final int newCol = col + direction[1];

                    if (
                        newRow >= 0
                            && newRow < ROWS
                            && newCol >= 0
                            && newCol < COLS
                            && grid[newRow][newCol] == 1
                    ) {
                        queue.add(new int[] {newRow, newCol});
                        grid[newRow][newCol] = 2;
                        freshCount--;
                    }
                }
            }

            time++;
        }

        if (freshCount > 0) {
            return -1;
        }

        return time;
    }
}
