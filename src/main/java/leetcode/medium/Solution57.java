package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        List<int[]> result = new ArrayList<>();
        int index = 0; // newInterval이 포함되는 첫 index
        int length = intervals.length;

        // newInterval에 포함되지 않은 데이터 셋팅
        for (int[] interval : intervals) {
            if (interval[1] >= newInterval[0]) {
                break;
            }

            result.add(interval);
            index++;
        }

        // interval[1] >= newInterval[0]
        // interval[0] <= newInterval[1]
        while (index < length) {
            int[] interval = intervals[index];

            if (newInterval[1] < interval[0]) {
                break;
            }

            newInterval[0] = Math.min(newInterval[0], interval[0]);
            newInterval[1] = Math.max(newInterval[1], interval[1]);
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
