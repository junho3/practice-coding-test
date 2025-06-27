package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 시간복잡도: O(N)
        // 공간복잡도: O(N)

        if (root == null) {
            return List.of();
        }

        final List<List<Integer>> result = new ArrayList<>();
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final int length = queue.size();
            final List<Integer> list = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                final TreeNode node = queue.poll();

                list.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(list);
        }

        return result;
    }
}
