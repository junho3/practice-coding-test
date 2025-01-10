package leetcode.medium;

public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        // 1. y.length, x.length 구하고
        // 2. target이 y[index][0], y[index][max] 사이인지 확인
        // 3. target이 y[index]에 포함되면 y[index]내에서 판단
        // 4. target이 y[index][0]보다 작으면 0 ~ index 에서 2,3번 반복
        // 5. target이 y[index][max]보다 크면 index ~ max 에서 2,3번 반복

        int yStartIndex = 0;
        int yEndIndex = matrix.length - 1;
        int xStartIndex = 0;
        int xEndIndex = matrix[0].length - 1;
        int xMaxIndex = matrix[0].length - 1;

        while (yStartIndex <= yEndIndex) {
            int yMidIndex = (yStartIndex + yEndIndex) / 2;

            if (target >= matrix[yMidIndex][0] && target <= matrix[yMidIndex][xMaxIndex]) {
                while (xStartIndex <= xEndIndex) {
                    int xMidIndex = (xStartIndex + xEndIndex) / 2;

                    if (target == matrix[yMidIndex][xMidIndex]) {
                        return true;
                    }

                    if (target > matrix[yMidIndex][xMidIndex]) {
                        xStartIndex = xMidIndex + 1;
                    } else if (target < matrix[yMidIndex][xMidIndex]) {
                        xEndIndex = xMidIndex - 1;
                    }
                }
            }

            if (target > matrix[yMidIndex][0]) {
                yStartIndex = yMidIndex + 1;
            } else if (target < matrix[yMidIndex][0]) {
                yEndIndex = yMidIndex - 1;
            }
        }

        return false;
    }
}
