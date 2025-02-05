package leetcode.medium;

public class Solution130 {

    private Integer ROWS;
    private Integer COLS;

    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;

        // 가장 자리가 O인 경우는 둘러쌀 수 없으므로 다른 글자로 임시 변환
        for (int row = 0; row < ROWS; row++) {
            if (board[row][0] == 'O') {
                dfs(board, row, 0);
            }
            if (board[row][COLS - 1] == 'O') {
                dfs(board, row, COLS - 1);
            }
        }

        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == 'O') {
                dfs(board, 0, col);
            }
            if (board[ROWS - 1][col] == 'O') {
                dfs(board, ROWS - 1, col);
            }
        }

        // O는 X로 변경
        // T는 O로 변경
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == 'T') {
                    board[row][col] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS || board[row][col] != 'O') {
            return;
        }

        board[row][col] = 'T';
        dfs(board, row + 1, col);
        dfs(board, row - 1, col);
        dfs(board, row, col + 1);
        dfs(board, row, col - 1);
    }
}
