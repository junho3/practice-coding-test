package leetcode.medium;

import neetcode.trees.TreeNode;

public class Solution98 {
    public boolean isValidBST(TreeNode root) {
//        Input: root = [2,1,3]
//        Output: true

//        Input: root = [5,1,4,null,null,3,6]
//        Output: false
        if (root == null) {
            return true;
        }

        return dfs(root.left, Long.MIN_VALUE, root.val) && dfs(root.right, root.val, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long leftLimit, long rightLimit) {
        if (node == null) {
            return true;
        }

        if (leftLimit >= node.val) {
            return false;
        }

        if (node.val >= rightLimit) {
            return false;
        }

        return dfs(node.left, leftLimit, node.val) && dfs(node.right, node.val, rightLimit);
    }
}
