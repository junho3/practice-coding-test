package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                numbers.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(numbers);
        }

        return result;
    }
}
