package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colums = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxs = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            colums.put(i, new HashSet<>());
            boxs.put(i, new HashSet<>());
        }

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                char ch = board[y][x];

                if (ch == '.') {
                    continue;
                }

                // x 축 검사
                if (rows.get(y).contains(ch)) {
                    return false;
                } else {
                    rows.get(y).add(ch);
                }

                // y 축 검사
                if (colums.get(x).contains(ch)) {
                    return false;
                } else {
                    colums.get(x).add(ch);
                }

                // box 검사
                // 0.0(0), 0.1(1), 0.2(2)
                // 1.0(3), 1.1(4), 1.2(5)
                // 2.0(6), 2.1(7), 2.2(8)
                int key = ((y / 3) * 3) + (x / 3);
                if (boxs.get(key).contains(ch)) {
                    return false;
                } else {
                    boxs.get(key).add(ch);
                }
            }
        }

        return true;
    }
}
