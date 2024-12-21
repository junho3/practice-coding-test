package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution543 {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        return Math.max(dfs(root), diameter);
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        diameter = Math.max(left + right, diameter);

        return Math.max(left, right) + 1;
    }
}
