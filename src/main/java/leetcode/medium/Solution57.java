package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final List<int[]> result = new ArrayList<>();
        final int length = intervals.length;
        int index = 0;

        while (index < length && newInterval[0] > intervals[index][1]) {
            result.add(intervals[index]);
            index++;
        }

        while (index < length && newInterval[1] >= intervals[index][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);

        while (index < length) {
            result.add(intervals[index]);
            index++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
