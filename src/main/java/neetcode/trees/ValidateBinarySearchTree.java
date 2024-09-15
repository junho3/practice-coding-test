package neetcode.trees;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return validSubTreeNode(root.left, Integer.MIN_VALUE, root.val)
            && validSubTreeNode(root.right, root.val, Integer.MAX_VALUE);
    }

//[5 4 6 null null 3 7]
//
//1. 4    MIN 5
//2. 6    5   MAX
//3. 3    5   6
//4. 7    6   MAX
    private Boolean validSubTreeNode(TreeNode treeNode, int leftLimit, int rightLimit) {
        if (treeNode == null) {
            return true;
        }

        if (treeNode.val <= leftLimit) {
            return false;
        }

        if (treeNode.val >= rightLimit) {
            return false;
        }

        return validSubTreeNode(treeNode.left, leftLimit, treeNode.val)
            && validSubTreeNode(treeNode.right, treeNode.val, rightLimit);
    }
}
