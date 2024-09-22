package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        // left와 right를 동시에 탐색해야하고
        return validate(root.left, root.right);
    }

    private boolean validate(TreeNode leftNode, TreeNode rightNode) {
        // left와 right가 모두 null이면 true
        if (leftNode == null && rightNode == null) {
            return true;
        }

        // left 또는 right 둘 중에 하나만 null이면 false
        if (leftNode == null || rightNode == null) {
            return false;
        }

        // 현재 값이 같고, 자식 노드를 재귀적으로 탐색
        return leftNode.val == rightNode.val
            && validate(leftNode.left, rightNode.right)
            && validate(leftNode.right, rightNode.left);
    }
}
