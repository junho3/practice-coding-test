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

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (word.length() == i) {
            return true;
        }

        if (
            r >= 0
                && r < board.length
                && c >= 0
                && c < board[0].length
                && board[r][c] == word.charAt(i)
        ) {
            char temp = board[r][c];
            board[r][c] = '#'; // 임시로 다른 문자로 변환하여 이전 위치로 돌아가지 못 하도록 함
            boolean isSame = dfs(board, word, r - 1, c, i + 1)
                || dfs(board, word, r + 1, c, i + 1)
                || dfs(board, word, r, c - 1, i + 1)
                || dfs(board, word, r, c + 1, i + 1);
            board[r][c] = temp;

            return isSame;
        }

        return false;
    }
}
