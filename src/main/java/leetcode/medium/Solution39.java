package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution39 {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, 0, new ArrayList<>(), 0);
        return result;
    }

    private void dfs(
        int[] candidates,
        int target,
        int index,
        List<Integer> combinations,
        int sum
    ) {
        if (target == sum) {
            result.add(combinations);
            return;
        }

        if (sum > target || index >= candidates.length) {
            return;
        }

        // index를 고정하고 조합 찾기
        List<Integer> newCombinations = new ArrayList<>(combinations);
        newCombinations.add(candidates[index]);
        dfs(candidates, target, index, newCombinations, sum + candidates[index]);

        // index를 +1 하면서 조합 찾기
        dfs(candidates, target, index + 1, combinations, sum);
    }

    private void dfs(
        int[] candidates,
        int target,
        int index,
        Stack<Integer> combination,
        int sum
    ) {
        if (target == sum) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            int num = candidates[i];

            combination.push(num);
            dfs(candidates, target, i, combination, sum + num);
            combination.pop();
        }
    }
}
