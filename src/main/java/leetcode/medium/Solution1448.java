package leetcode.medium;

import neetcode.trees.TreeNode;

public class Solution1448 {

    int result = 0;

    public int goodNodes(TreeNode root) {

        result++;
        dfs(root.left, root.val);
        dfs(root.right, root.val);

        return result;
    }

    private void dfs(TreeNode treeNode, int max) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.val >= max) {
            result++;
        }

        if (treeNode.left != null) {
            dfs(treeNode.left, Math.max(treeNode.val, max));
        }

        if (treeNode.right != null) {
            dfs(treeNode.right, Math.max(treeNode.val, max));
        }
    }
}
