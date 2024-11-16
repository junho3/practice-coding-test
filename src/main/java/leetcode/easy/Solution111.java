package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution111 {
    public int minDepth(TreeNode root) {
        // 1. bfs

        // 2. left == null && right == null 이면 종료

        // 3. 그외 깊이 + 1 하면서 순회

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            depth++;
        }

        return depth;
    }
}
