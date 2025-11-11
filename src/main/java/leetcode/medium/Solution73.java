package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution73 {

    // matrix에 숫자 0이 존재할 때 숫자 0을 기준으로 행과 열을 모두 0으로 변경하기

    public void setZeroes(int[][] matrix) {

        // 시간 복잡도 O(N * M)
        // 공간 복잡도 O(N + M)

        int n = matrix.length;
        int m = matrix[0].length;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 0) {
                    rows.add(row);
                    cols.add(col);
                }
            }
        }

        for (int row : rows) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = 0;
            }
        }

        for (int col : cols) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = 0;
            }
        }
    }
}
