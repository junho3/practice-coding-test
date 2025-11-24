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

    private void dfs(int[] candidates, int target, int index, List<Integer> combinations, int sum) {
        if (target == sum) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] > target) {
                break;
            }

            combinations.add(candidates[i]);
            dfs(candidates, target, i + 1, combinations, sum + candidates[i]);
            combinations.remove(combinations.size() - 1);
        }
    }
}
