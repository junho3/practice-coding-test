package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        // 시간복잡도 O(N * 2^N)
        // 공간복잡도 O(N)
        dfs(nums, 0, new ArrayList<>());

        return result;
    }

    private void dfs(int[] nums, int index, List<Integer> subset) {
        if (nums.length == index) {
            result.add(subset);
            return;
        }

        dfs(nums, index + 1, subset);

        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[index]);
        dfs(nums, index + 1, newSubset);
    }
}
