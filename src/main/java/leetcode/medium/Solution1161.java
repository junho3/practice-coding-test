package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        int max = Integer.MIN_VALUE;
        int maxLevel = 0;
        while (!queue.isEmpty()) {
            level++;

            int length = queue.size();
            int sum = 0;
            for (int i = 0; i < length; i++) {
                TreeNode treeNode = queue.poll();
                sum += treeNode.val;

                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }

            if (sum > max) {
                max = sum;
                maxLevel = level;
            }
        }

        return maxLevel;
    }
}
