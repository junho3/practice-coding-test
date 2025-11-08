package leetcode.medium;

public class Solution2658 {

    public int findMaxFish(int[][] grid) {

        int maximumNumber = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] > 0) {
                    int number = dfs(grid, r, c);

                    maximumNumber = Math.max(maximumNumber, number);
                }
            }
        }

        return maximumNumber;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (
            r < 0
            || c < 0
            || r >= grid.length
            || c >= grid[0].length
            || grid[r][c] == 0
        ) {
            return 0;
        }

        int number = grid[r][c];
        grid[r][c] = 0;

        return number
            + dfs(grid, r + 1, c)
            + dfs(grid, r - 1, c)
            + dfs(grid, r, c + 1)
            + dfs(grid, r, c - 1);
    }
}
