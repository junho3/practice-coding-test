package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution145 {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);

        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        dfs(node.right);
        result.add(node.val);
    }
}
