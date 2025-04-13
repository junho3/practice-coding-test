package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution46 {

    private List<List<Integer>> permutes = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<>(), new boolean[nums.length]);
        return permutes;
    }

    private void dfs(int[] nums, List<Integer> permute, boolean[] visited) {
        // 1. 순열이 완성되면 종료
        if (nums.length == permute.size()) {
            permutes.add(permute);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                List<Integer> newPermute = new ArrayList<>(permute);
                newPermute.add(nums[i]);

                dfs(nums, newPermute, visited);

                visited[i] = false;
            }
        }
    }
}
