package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                result++;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }

    public int countNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return dfs(node.left) + dfs(node.right) + 1;
    }
}
