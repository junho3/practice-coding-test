package leetcode.medium;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        // 시간복잡도 O(n^2)
        // 공간복잡도 O(1)

        // 1. 행, 열, 박스 체크를 위한 boolean 배열 정의
        // 스도쿠는 1~9까지 숫자만 존재하므로 길이 9짜리 배열로 처리 가능
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // 2. board를 순회하여 boolean 배열 검증
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                char ch = board[row][col];

                if (ch == '.') {
                    continue;
                }

                int number = ch - '1';
                int box = (row / 3) * 3 + (col / 3);

                // 3. 해당 숫자가 이미 존재하는지 체크
                if (rows[row][number] || cols[col][number] || boxes[box][number]) {
                    return false;
                }

                rows[row][number] = true;
                cols[col][number] = true;
                boxes[box][number] = true;
            }
        }

        return true;
    }
}
