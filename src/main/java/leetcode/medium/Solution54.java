package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {

    private final List<Integer> results = new ArrayList<>();
    private final int[][] DIRECTIONS = {{0,1},{1,0},{0,-1},{-1,0}};

    public List<Integer> spiralOrder(int[][] matrix) {
        dfs(matrix, 0, 0, 0);

        return results;
    }

    private void dfs(int[][] matrix, int r, int c, int directionIndex) {
        results.add(matrix[r][c]);
        matrix[r][c] = Integer.MIN_VALUE;

        int newR = r + DIRECTIONS[directionIndex][0];
        int newC = c + DIRECTIONS[directionIndex][1];
        int newDirectionIndex = directionIndex;

        if (
            newR < 0
            || newR >= matrix.length
            || newC < 0
            || newC >= matrix[0].length
            || matrix[newR][newC] == Integer.MIN_VALUE
        ) {
            newDirectionIndex = (newDirectionIndex + 1) % 4;
            newR = r + DIRECTIONS[newDirectionIndex][0];
            newC = c + DIRECTIONS[newDirectionIndex][1];

            if (
                newR < 0
                    || newR >= matrix.length
                    || newC < 0
                    || newC >= matrix[0].length
                    || matrix[newR][newC] == Integer.MIN_VALUE
            ) {
                return;
            }
        }

        dfs(matrix, newR, newC, newDirectionIndex);
    }
}
