package neetcode.trees;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root != null && subRoot == null) {
            return true;
        }
        if (root == null && subRoot != null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }

        if (s != null && t != null && s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }

        return false;
    }
}
