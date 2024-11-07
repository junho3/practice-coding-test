package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        return dfs(root, val);
    }

    private TreeNode dfs(TreeNode treeNode, int val) {
        if (treeNode == null) {
            return null;
        }

        if (treeNode.val > val) {
            return dfs(treeNode.left, val);
        }

        if (treeNode.val < val) {
            return dfs(treeNode.right, val);
        }

        return treeNode;
    }
}
