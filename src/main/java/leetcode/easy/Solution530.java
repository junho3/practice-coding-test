package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution530 {

    int minDifference = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minDifference;
    }

    private void dfs(TreeNode node) {
        if (node.left != null) {
            dfs(node.left);
        }

        if (prev != null) {
            minDifference = Math.min(Math.abs(node.val - prev), minDifference);
        }
        prev = node.val;

        if (node.right != null) {
            dfs(node.right);
        }
    }
}
