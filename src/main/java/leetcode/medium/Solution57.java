package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        List<int[]> result = new ArrayList<>();
        int index = 0;
        int length = intervals.length;

        // 1. newInterval보다 앞에 있는 구간
        while (index < length && newInterval[0] > intervals[index][1]) {
            result.add(intervals[index]);
            index++;
        }

        // 2. newInterval과 겹치는 구간
        while (index < length && newInterval[1] >= intervals[index][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);

        // 3. newInterval보다 밖에 있는 구간
        while (index < length) {
            result.add(intervals[index]);
            index++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
