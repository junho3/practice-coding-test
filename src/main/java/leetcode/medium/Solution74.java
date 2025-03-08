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
        // target이 matrix의 가장 작은 값보다 더 작을 때 top: 0, bottom: -1이 됨
        // target이 matrix의 가장 큰 값보다 더 클 때 top: 4, bottom: 3이 됨
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
