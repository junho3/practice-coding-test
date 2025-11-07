package leetcode.medium;

public class Solution2482 {
    public int[][] onesMinusZeros(int[][] grid) {

        int[] rowOneCounts = new int[grid.length];
        int[] colOneCounts = new int[grid[0].length];

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    rowOneCounts[r]++;
                    colOneCounts[c]++;
                }
            }
        }

        for (int r = 0; r < grid.length; r++) {

            int rowOneCount = rowOneCounts[r];

            for (int c = 0; c < grid[0].length; c++) {
                int colOneCount = colOneCounts[c];

                grid[r][c] = rowOneCount
                    + colOneCount
                    - (grid.length - rowOneCount)
                    - (grid[0].length - colOneCount);
            }
        }

        return grid;
    }
}
