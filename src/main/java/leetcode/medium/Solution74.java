package leetcode.medium;

public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bottom = ROWS - 1;
        while (top <= bottom) {
            int mid = (top + bottom) / 2;

            if (target > matrix[mid][COLS - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                // target이 mid 라인에 포함하는 경우
                break;
            }
        }

        // target이 matrix에 포함되지 않을 때 top > bottom이 발생
        if (top > bottom) {
            return false;
        }

        int row = (top + bottom) / 2;
        int left = 0;
        int right = COLS - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > matrix[row][mid]) {
                left = mid + 1;
            } else if (target < matrix[row][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
