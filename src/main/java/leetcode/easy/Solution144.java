package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);

        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
