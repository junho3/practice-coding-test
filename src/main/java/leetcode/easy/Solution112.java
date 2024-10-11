package leetcode.easy;

import neetcode.trees.TreeNode;

public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
//        Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//        Output: true

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        boolean hasLeftPathSum = hasPathSum(root.left, targetSum - root.val);
        boolean hasRightPathSum = hasPathSum(root.right, targetSum - root.val);

        return hasLeftPathSum && hasRightPathSum;
    }
}
