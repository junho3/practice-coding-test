package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution40 {

    private final Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), 0);
        return new ArrayList<>(result);
    }

    private void dfs(int[] candidates, int target,  int index, List<Integer> combination, int sum) {
        if (target == sum) {
            result.add(combination);
            return;
        }

        if (target < sum) {
            return;
        }

        if (index >= candidates.length) {
            return;
        }

        List<Integer> newCombination = new ArrayList<>(combination);
        newCombination.add(candidates[index]);
        dfs(candidates, target, index + 1, newCombination, sum + candidates[index]);
        dfs(candidates, target, index + 1, combination, sum);
    }
}
