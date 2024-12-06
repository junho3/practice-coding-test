package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution404 {

    private int result = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root.left, true);
        dfs(root.right, false);

        return result;
    }

    private void dfs(TreeNode node, boolean isLeft) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null && isLeft) {
            result += node.val;
            return;
        }

        dfs(node.left, true);
        dfs(node.right, false);
    }
}
