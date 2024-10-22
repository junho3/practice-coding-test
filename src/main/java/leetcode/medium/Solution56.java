package leetcode.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
//        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]


        // 1. intervals 정렬
        // 2. intervals i = 1부터 순회
        // 3.

        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervals[0];
        List<int[]> results = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                results.add(prev);
                prev = intervals[i];
            }
        }

        results.add(prev);

        return results.toArray(new int[results.size()][]);
    }
}
