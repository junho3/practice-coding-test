package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high);
    }

    private int dfs(TreeNode node, int low, int high) {
        if (node == null) {
            return 0;
        }

        int number = 0;
        if (node.val > high || node.val < low) {
            number = 0;
        } else {
            number = node.val;
        }

        return number + dfs(node.left, low, high) + dfs(node.right, low, high);
    }
}
