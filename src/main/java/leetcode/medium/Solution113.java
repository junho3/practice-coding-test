package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution113 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N^2)

        dfs(root, targetSum, 0, new ArrayList<>());

        return result;
    }

    private void dfs(TreeNode node, int targetSum, int sum, List<Integer> path) {
        if (node == null) {
            return;
        }

        int newSum = sum + node.val;
        List<Integer> newPath = new ArrayList<>(path); // 매번 리스트를 새로 생성하므로 공간복잡도가 O(N^2)

        if (node.left == null && node.right == null && sum == targetSum) {
            result.add(newPath);
            return;
        }

        dfs(node.left, targetSum, newSum, newPath);
        dfs(node.right, targetSum, newSum, newPath);

//        path.remove(path.size() - 1); // 백트래킹 방식으로 리스트를 1개만 관리하면 공간복잡도를 줄일 수 있음
    }
}
