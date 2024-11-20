package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {

    private final List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        dfs(root, "");

        return result;
    }

    private void dfs(TreeNode node, String path) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }

        String newPath = path + node.val + "->";
        dfs(node.left, newPath);
        dfs(node.right, newPath);
    }
}
