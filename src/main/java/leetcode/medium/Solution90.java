package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution90 {

    private final Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), 0);
        return new ArrayList<>(result);
    }

    private void dfs(int[] nums, List<Integer> subset, int i) {
        if (i == nums.length) {
            result.add(subset);
            return;
        }

        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[i]);
        dfs(nums, newSubset, i + 1);
        dfs(nums, subset, i + 1);
    }
}
