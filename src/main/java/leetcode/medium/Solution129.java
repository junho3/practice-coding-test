package leetcode.medium;

import neetcode.trees.TreeNode;

public class Solution129 {
    public int sumNumbers(TreeNode root) {
        int result = getNumber(root, 0);

        return result;
    }

    private int getNumber(TreeNode node, int num) {
        if (node == null) {
            return 0;
        }

        int number = (num * 10) + node.val;

        if (node.left == null && node.right == null) {
            return number;
        }

        int leftNumber = getNumber(node.left, number);
        int rightNumber = getNumber(node.right, number);

        return leftNumber + rightNumber;
    }
}
