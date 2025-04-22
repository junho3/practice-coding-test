package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        final List<Integer> results = new ArrayList<>();

        if (root == null) {
            return results;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                final TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                if (i == length - 1) {
                    results.add(node.val);
                }
            }
        }

        return results;
    }
}
