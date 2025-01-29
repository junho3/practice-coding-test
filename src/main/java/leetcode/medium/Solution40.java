package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution40 {

    private HashSet<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        return new ArrayList<>(result);
    }

    private void dfs(int[] candidates, int target, List<Integer> combination, int i, int sum) {
        if (target == sum) {
            result.add(combination);
            return;
        }

        if (target < sum || i >= candidates.length) {
            return;
        }

        List<Integer> newCombination = new ArrayList<>(combination);
        newCombination.add(candidates[i]);
        dfs(candidates, target, newCombination, i + 1, sum + candidates[i]);
        dfs(candidates, target, combination, i + 1, sum);
    }
}
