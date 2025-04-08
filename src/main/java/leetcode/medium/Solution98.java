package leetcode.medium;

import neetcode.trees.TreeNode;

public class Solution98 {
    public boolean isValidBST(TreeNode root) {
//        Input: root = [2,1,3]
//        Output: true

//        Input: root = [5,1,4,null,null,3,6]
//        Output: false
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean dfs(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }

        if (node.val <= min) {
            return false;
        }

        if (node.val >= max) {
            return false;
        }

        return dfs(node.left, node.val, min) && dfs(node.right, max, node.val);
    }
}
