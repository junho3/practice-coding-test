package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
//        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]

//        [[1,4],[2,3]]
//        [[1,4]]

        // 1. intervals 정렬
        // 2. intervals i = 1부터 순회
        // 3.

        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        final List<int[]> result = new ArrayList<>();

        int curr = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[curr][1] >= intervals[i][0]) {
                intervals[curr][1] = Math.max(intervals[curr][1], intervals[i][1]);
            } else {
                result.add(intervals[curr]);
                curr = i;
            }
        }

        result.add(intervals[curr]);

        return result.toArray(new int[result.size()][]);
    }
}
