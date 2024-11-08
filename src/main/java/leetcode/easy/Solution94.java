package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        dfs(root);

        return result;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        dfs(treeNode.left);
        result.add(treeNode.val);
        dfs(treeNode.right);
    }
}
