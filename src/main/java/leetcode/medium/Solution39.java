package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        return result;
    }

    private void dfs(int[] candidates, int target, List<Integer> combination, int i, int sum) {
        if (target < sum || i >= candidates.length) {
            return;
        }

        if (target == sum) {
            result.add(combination);
            return;
        }

        List<Integer> newCombination = new ArrayList<>(combination);
        newCombination.add(candidates[i]);
        dfs(candidates, target, newCombination, i, sum + candidates[i]);

        dfs(candidates, target, combination, i + 1, sum);
    }
}
