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

        List<int[]> result = new ArrayList<>();
        int left = 0;
        int right = 1;
        while (right < intervals.length) {
            if (intervals[left][1] >= intervals[right][0]) {
                intervals[left][0] = Math.min(intervals[left][0], intervals[right][0]);
                intervals[left][1] = Math.max(intervals[left][1], intervals[right][1]);
            } else {
                result.add(intervals[left]);
                left = right;
            }
            right++;
        }
        result.add(intervals[left]);

        return result.toArray(new int[result.size()][]);
    }
}
