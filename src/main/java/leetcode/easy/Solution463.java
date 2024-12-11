package leetcode.easy;

public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    // 상
                    result += up(grid, i, j);

                    // 하
                    result += down(grid, i, j);

                    // 좌
                    result += left(grid, i, j);

                    // 우
                   result += right(grid, i, j);
                }
            }
        }

        return result;
    }

    private int up(int[][] grid, int i, int j) {
        if (i - 1 < 0) {
            return 1;
        }

        if (grid[i - 1][j] == 0) {
            return 1;
        }

        return 0;
    }

    private int down(int[][] grid, int i, int j) {
        if (i + 1 == grid.length) {
            return 1;
        }

        if (grid[i + 1][j] == 0) {
            return 1;
        }

        return 0;
    }

    private int left(int[][] grid, int i, int j) {
        if (j - 1 < 0) {
            return 1;
        }

        if (grid[i][j - 1] == 0) {
            return 1;
        }

        return 0;
    }

    private int right(int[][] grid, int i, int j) {
        if (j + 1 == grid[i].length) {
            return 1;
        }

        if (grid[i][j + 1] == 0) {
            return 1;
        }

        return 0;
    }
}
