package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution994 {

    private Integer ROWS;
    private Integer COLS;
    private int[][] MOVES = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int orangesRotting(int[][] grid) {

        // 0: 빈칸
        // 1: 신선한 오렌지
        // 2: 썩은 오렌지

        // 1. 썩은 오렌지를 큐에 넣고 BFS로 시간 구하기

        // 2. 신선한 오렌지 개수가 0이거나 큐가 빌 때까지
        ROWS = grid.length;
        COLS = grid[0].length;

        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == 1) {
                    fresh++;
                } else if (grid[row][col] == 2) {
                    queue.add(new int[] {row, col});
                }
            }
        }

        int time = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            boolean isRotten = false;

            for (int i = 0; i < length; i++) {
                int[] location = queue.poll();
                int row = location[0];
                int col = location[1];

                for (int[] move : MOVES) {
                    int movedRow = row + move[0];
                    int movedCol = col + move[1];

                    if (
                        movedRow >= 0
                            && movedRow < ROWS
                            && movedCol >= 0
                            && movedCol < COLS
                            && grid[movedRow][movedCol] == 1
                    ) {
                        fresh--;
                        grid[movedRow][movedCol] = 2;
                        isRotten = true;
                        queue.add(new int[] {movedRow, movedCol});
                    }
                }
            }

            // 신선한 오렌지가 썪었을 경우에만 시간 증가
            if (isRotten) {
                time++;
            }
        }

        return fresh > 0 ? -1 : time;
    }
}
