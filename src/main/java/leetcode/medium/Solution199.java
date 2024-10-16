package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                if (i == length - 1) {
                    result.add(node.val);
                }
            }
        }

        return result;
    }
}
