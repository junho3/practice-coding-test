package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counts = new int[nums.length];
        for (int num : nums) {
            counts[num - 1]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
