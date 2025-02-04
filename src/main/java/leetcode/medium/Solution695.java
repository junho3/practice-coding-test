package leetcode.medium;

public class Solution695 {

    private Integer ROWS;
    private Integer COLS;

    public int maxAreaOfIsland(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        int max = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                max = Math.max(max, dfs(grid, row, col));
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;
        return 1
            + dfs(grid, row + 1, col)
            + dfs(grid, row - 1, col)
            + dfs(grid, row, col + 1)
            + dfs(grid, row, col - 1);
    }
}
