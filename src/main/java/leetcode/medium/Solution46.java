package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution46 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private void dfs(int[] nums, List<Integer> permute, boolean[] pick) {
        if (nums.length == permute.size()) {
            result.add(permute);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!pick[i]) {
                pick[i] = true;
                List<Integer> newPermut = new ArrayList<>(permute);
                newPermut.add(nums[i]);

                dfs(nums, newPermut, pick);
                pick[i] = false;
            }
        }
    }
}
