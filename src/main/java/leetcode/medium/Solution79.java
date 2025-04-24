package leetcode.medium;

public class Solution79 {

    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (word.length() == i) {
            return true;
        }

        if (r < 0) {
            return false;
        }

        if (r >= board.length) {
            return false;
        }

        if (c < 0) {
            return false;
        }

        if (c >= board[0].length) {
            return false;
        }

        if (board[r][c] != word.charAt(i)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';
        boolean isSame = dfs(board, word, r + 1, c, i + 1)
            || dfs(board, word, r - 1, c, i + 1)
            || dfs(board, word, r, c + 1, i + 1)
            || dfs(board, word, r, c - 1, i + 1);
        board[r][c] = temp;

        return isSame;
    }
}
