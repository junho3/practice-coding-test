package leetcode.easy;

import java.util.HashMap;

public class Solution1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        for (int[] domino : dominoes) {
            StringBuilder sb = new StringBuilder();
            sb.append(Math.min(domino[0], domino[1]));
            sb.append("#");
            sb.append(Math.max(domino[0], domino[1]));
            final String key = sb.toString();

            final int count = map.getOrDefault(key, 0);
            result += count;
            map.put(key, count + 1);
        }

        return result;
    }
}

// 1 > 0
// 2 > 1
// 3 > 3
// 4 > 6
// 5 > 10
// 6 > 15
// 7 > 21

