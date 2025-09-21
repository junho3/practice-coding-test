package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                nums.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            // List로 한 다음, 마지막에 Collections.reverse(result);로 해도 됨
            result.addFirst(nums);
        }

        return result;
    }
}
