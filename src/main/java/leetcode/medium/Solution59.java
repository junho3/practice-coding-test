package leetcode.medium;

public class Solution59 {

    private final int[][] directions = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        dfs(matrix, 0, 0, 0, 1);

        return matrix;
    }

    private void dfs(int[][] matrix, int r, int c, int index, int num) {
        matrix[r][c] = num;

        int newIndex = index;
        int newR = r + directions[newIndex][0];
        int newC = c + directions[newIndex][1];

        if (
            newR < 0
            || newC < 0
            || newR >= matrix.length
            || newC >= matrix[0].length
            || matrix[newR][newC] != 0
        ) {
            newIndex = (newIndex + 1) % 4;
            newR = r + directions[newIndex][0];
            newC = c + directions[newIndex][1];

            if (
                newR < 0
                || newC < 0
                || newR >= matrix.length
                || newC >= matrix[0].length
                || matrix[newR][newC] != 0
            ) {
                return;
            }
        }

        dfs(matrix, newR, newC, newIndex, num + 1);
    }
}
