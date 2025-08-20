package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        // 시간복잡도 O(n log n) >> 정렬
        // 공간복잡도 O(n)

        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        final List<int[]> result = new ArrayList<>();
        int curr = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[curr][1] >= intervals[i][0]) {
                // interval 합치기
                intervals[curr][1] = Math.max(intervals[i][1], intervals[curr][1]);
            } else {
                result.add(intervals[curr]);
                curr = i;
            }
        }

        result.add(intervals[curr]);

        return result.toArray(new int[result.size()][]);
    }
}
