package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.HashSet;

public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    private boolean dfs(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }

        if (set.contains(node.val)) {
            return true;
        }
        set.add(k - node.val);

        return dfs(node.left, k, set) || dfs(node.right, k, set);
    }
}
