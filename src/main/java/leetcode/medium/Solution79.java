package leetcode.medium;

public class Solution79 {

    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (dfs(board, word, x, y, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int x, int y, int i) {
        if (i == word.length()) {
            return true;
        }

        // 상
        if (y < 0) {
            return false;
        }

        // 하
        if (y == board.length) {
            return false;
        }

        // 좌
        if (x < 0) {
            return false;
        }

        // 우
        if (x == board[0].length) {
            return false;
        }

        // 방문
        if (visited[y][x]) {
            return false;
        }

        // 글자
        if (word.charAt(i) != board[y][x]) {
            return false;
        }

        // 방문처리
        visited[y][x] = true;
        boolean result = dfs(board, word, x, y - 1, i + 1)
            || dfs(board, word, x, y + 1, i + 1)
            || dfs(board, word, x - 1, y, i + 1)
            || dfs(board, word, x + 1, y, i + 1);
        visited[y][x] = false;

        return result;
    }
}
