package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);

        return list.get(k - 1);
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        dfs(node.left, result);
        result.add(node.val);
        dfs(node.right, result);
    }
}
