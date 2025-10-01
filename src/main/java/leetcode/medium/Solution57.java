package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        int index = 0;
        List<int[]> result = new ArrayList<>();
        // 1. 포함 안되는 이전 케이스
        while (index < intervals.length) {
            if (intervals[index][1] >= newInterval[0]) {
                break;
            }

            result.add(intervals[index]);
            index++;
        }

        // 2. 포함하는 케이스
        while (index < intervals.length) {
            if (intervals[index][0] > newInterval[1]) {
                break;
            }
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }
        result.add(newInterval);

        // 3. 포함 안되는 이후 케이스
        while (index < intervals.length) {
            result.add(intervals[index]);
            index++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
