package leetcode.medium;

public class Solution419 {

    private static Integer ROWS;
    private static Integer COLS;

    public int countBattleships(char[][] board) {
        // 시간복잡도 O(N * M)
        // 공간복잡도 O(N * M)

        int count = 0;
        ROWS = board.length;
        COLS = board[0].length;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == 'X') {
                    dfs(board, r, c);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] board, int r, int c) {
        if (
            r < 0
            || r >= ROWS
            || c < 0
            || c >= COLS
            || board[r][c] == '.'
        ) {
            return;
        }

        board[r][c] = '.';

        dfs(board, r - 1, c);
        dfs(board, r + 1, c);
        dfs(board, r, c - 1);
        dfs(board, r, c + 1);
    }
}
