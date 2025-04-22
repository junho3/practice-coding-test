package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {

    private final List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return results;
    }

    private void dfs(int[] nums, int i, List<Integer> subset) {
        if (i == nums.length) {
            results.add(subset);
            return;
        }

        final List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[i]);

        dfs(nums, i + 1, newSubset);
        dfs(nums, i + 1, subset);
    }
}
