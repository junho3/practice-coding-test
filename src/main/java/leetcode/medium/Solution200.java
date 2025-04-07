package leetcode.medium;

public class Solution200 {

    private Integer ROWS;
    private Integer COLS;

    public int numIslands(char[][] grid) {
        int count = 0;
        ROWS = grid.length;
        COLS = grid[0].length;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        if (row < 0
            || row >= ROWS
            || col < 0
            || col >= COLS
            || grid[row][col] == '0'
        ) {
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}
