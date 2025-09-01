package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Solution994 {

    private final int[][] DIRECTIONS = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public int orangesRotting(int[][] grid) {
        // 시간복잡도 O(N * M)
        // 공간복잡도 O(N * M)

        int freshCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    freshCount++;
                } else if (grid[r][c] == 2) {
                    queue.add(new int[] {r, c});
                }
            }
        }

        if (freshCount == 0) {
            return 0;
        }

        int time = -1;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int[] rotten = queue.poll();

                for (int[] direction : DIRECTIONS) {
                    int newR = rotten[0] + direction[0];
                    int newC = rotten[1] + direction[1];

                    if (
                        newR >= 0
                        && newR < grid.length
                        && newC >= 0
                        && newC < grid[0].length
                        && grid[newR][newC] == 1
                    ) {
                        freshCount--;
                        grid[newR][newC] = 2;
                        queue.add(new int[] {newR, newC});
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
