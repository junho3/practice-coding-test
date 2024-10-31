package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution2352 {
    public int equalPairs(int[][] grid) {
//        [[3,2,1],[1,7,6],[2,7,7]]

        int n = grid.length;

        HashMap<String, Integer> xMap = new HashMap<>();
        HashMap<String, Integer> yMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder xSb = new StringBuilder();
            StringBuilder ySb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                xSb.append(grid[i][j]);
                xSb.append("#");

                ySb.append(grid[j][i]);
                ySb.append("#");
            }

            String xString = xSb.toString();
            String yString = ySb.toString();

            xMap.put(xString, xMap.getOrDefault(xString, 0) + 1);
            yMap.put(yString, yMap.getOrDefault(yString, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<String, Integer> map : xMap.entrySet()) {
            int xCount = map.getValue();
            int yCount = yMap.getOrDefault(map.getKey(), 0);

            result += xCount * yCount;
        }

        return result;
    }
}
