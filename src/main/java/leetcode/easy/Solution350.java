package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numbers = new int[1001];
        for (int num : nums1) {
            numbers[num]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (numbers[num] > 0) {
                result.add(num);
                numbers[num]--;
            }
        }

        return result.stream()
            .mapToInt(it -> it)
            .toArray();
    }
}
