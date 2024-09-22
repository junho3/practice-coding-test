package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution104 {
    public int maxDepth(TreeNode root) {

        // depth 설정
        int depth = 0;

        if (root == null) {
            return depth;
        }

        // Root 노드를 큐 삽입
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // 큐가 empty 될 때까지 반복
        while (!queue.isEmpty()) {
            // 큐 사이즈 셋팅
            int size = queue.size();

            // 큐에 삽입된 크기 만큼 큐 POLL
            for (int i = 0; i < size; i++) {
                if (queue.peek() != null) {
                    TreeNode treeNode = queue.poll();

                    if (treeNode.left != null) {
                        queue.add(treeNode.left);
                    }

                    if (treeNode.right != null) {
                        queue.add(treeNode.right);
                    }
                }
            }

            depth++;
        }

        return depth;
    }
}
