package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {

    List<Integer> result = new ArrayList<>();
    int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    public List<Integer> spiralOrder(int[][] matrix) {
        // 시간복잡도 O(N * M)
        // 공간복잡도 O(1)

        dfs(matrix, 0, 0, 0);

        return result;
    }

    private void dfs(int[][] matrix, int r, int c, int index) {
        result.add(matrix[r][c]);
        matrix[r][c] = Integer.MIN_VALUE;

        int newR = r + directions[index][0];
        int newC = c + directions[index][1];
        int newIndex = index;

        if (
            newR < 0
            || newC < 0
            || newR >= matrix.length
            || newC >= matrix[0].length
            || matrix[newR][newC] == Integer.MIN_VALUE
        ) {
            newIndex = (newIndex + 1) % 4;
            newR = r + directions[newIndex][0];
            newC = c + directions[newIndex][1];

            if (
                newR < 0
                    || newC < 0
                    || newR >= matrix.length
                    || newC >= matrix[0].length
                    || matrix[newR][newC] == Integer.MIN_VALUE
            ) {
                return;
            }
        }

        dfs(matrix, newR, newC, newIndex);
    }
}
