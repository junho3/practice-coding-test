package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution563 {
    private int result = 0;

    public int findTilt(TreeNode root) {
        dfs(root);

        return result;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        result += Math.abs(left - right);

        // 상위 root.val은 Math.abs(node.left의 모든 합 - node.right의 모든 합)
        return node.val + left + right;
    }
}
