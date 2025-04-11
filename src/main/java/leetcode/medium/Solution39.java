package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target,0, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(int[] candidates, int target, int index, List<Integer> combinations, int sum) {
        if (target == sum) {
            result.add(combinations);
            return;
        }

        if (sum > target || index >= candidates.length) {
            return;
        }

        List<Integer> newCombinations = new ArrayList<>(combinations);
        newCombinations.add(candidates[index]);
        dfs(candidates, target, index, newCombinations, sum + candidates[index]);

        dfs(candidates, target, index + 1, combinations, sum);
    }
}
