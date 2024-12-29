package leetcode.easy;

public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int width = mat[0].length;
        int height = mat.length;

        if (width * height != r * c) {
            return mat;
        }

        int rIndex = 0;
        int cIndex = 0;
        int[][] result = new int[r][c];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[rIndex][cIndex] = mat[i][j];

                if (cIndex == c - 1) {
                    rIndex++;
                    cIndex = 0;
                } else {
                    cIndex++;
                }
            }
        }

        return result;
    }
}
