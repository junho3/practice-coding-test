package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                numbers.add(node.val);
            }

            if (level % 2 == 0) {
                Collections.reverse(numbers);
                result.add(numbers);
            } else {
                result.add(numbers);
            }

            level++;
        }

        return result;
    }
}
