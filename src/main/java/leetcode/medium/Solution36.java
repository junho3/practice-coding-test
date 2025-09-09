package leetcode.medium;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        // 시간복잡도 O(n^2)
        // 공간복잡도 O(1)

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                char ch = board[r][c];

                if (ch == '.') {
                    continue;
                }

                int num = ch - '1'; // 배열 인덱스가 0번부터라서 '0' 대신 '1'로 함

//                0 | 1 | 2
//                ---------
//                3 | 4 | 5
//                ---------
//                6 | 7 | 8
//
//                ex) (4 / 3) * 3 + (0 / 3) >> 3
                int box = (r / 3) * 3 + (c / 3);

                if (rows[r][num] || cols[c][num] || boxes[box][num]) {
                    return false;
                }

                rows[r][num] = true;
                cols[c][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
}
