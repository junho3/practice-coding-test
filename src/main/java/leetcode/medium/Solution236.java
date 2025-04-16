package leetcode.medium;

import neetcode.trees.TreeNode;

public class Solution236 {

    private TreeNode ancestor;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);

        return ancestor;
    }

    private boolean dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return false;
        }

        boolean hasLeft = dfs(node.left, p, q);
        boolean hasRight = dfs(node.right, p, q);

        boolean isTarget = node.val == p.val || node.val == q.val;

        if (
            (hasLeft && isTarget)
            || (hasRight && isTarget)
            || (hasLeft && hasRight)
        ) {
            ancestor = node;
        }

        return hasLeft || hasRight || isTarget;
    }
}
