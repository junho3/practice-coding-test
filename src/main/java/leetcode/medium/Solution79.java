package leetcode.medium;

public class Solution79 {

    public boolean exist(char[][] board, String word) {
        // 시간 복잡도 O(N * M)
        // 공간 복잡도 O(N * M)

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int index) {
        if (word.length() == index) {
            return true;
        }

        if (
            r < 0
                || c < 0
                || r >= board.length
                || c >= board[0].length
                || board[r][c] != word.charAt(index)
        ) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';
        boolean isSame = dfs(board, word, r + 1, c, index + 1)
            || dfs(board, word, r - 1, c, index + 1)
            || dfs(board, word, r, c + 1, index + 1)
            || dfs(board, word, r, c - 1, index + 1);

        board[r][c] = temp;

        return isSame;
    }
}
