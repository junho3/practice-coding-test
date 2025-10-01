package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // 시간복잡도 O(N + M)
        // 공간복잡도 O(1)

        List<int[]> result = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            int firstStart = firstList[firstIndex][0];
            int firstEnd = firstList[firstIndex][1];

            int secondStart = secondList[secondIndex][0];
            int secondEnd = secondList[secondIndex][1];

            int start = Math.max(firstStart, secondStart);
            int end = Math.min(firstEnd, secondEnd);

            if (start <= end) {
                result.add(new int[] {start, end});
            }

            if (firstEnd < secondEnd) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
