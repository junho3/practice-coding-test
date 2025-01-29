package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(int[] candidates, int target, List<Integer> combination, int i) {
        if (target < 0 || i >= candidates.length) {
            return;
        }

        if (target == 0) {
            result.add(combination);
            return;
        }

        List<Integer> newCombination = new ArrayList<>(combination);
        newCombination.add(candidates[i]);
        dfs(candidates, target - candidates[i], newCombination, i);

        dfs(candidates, target, combination, i + 1);
    }
}
