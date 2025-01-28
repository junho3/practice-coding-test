package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        return result;
    }

    private void dfs(int i, int[] nums, List<Integer> subset) {
        if (i == nums.length) {
            result.add(subset);
            return;
        }

        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[i]);

        dfs(i + 1, nums, newSubset);
        dfs(i + 1, nums, subset);
    }
}
