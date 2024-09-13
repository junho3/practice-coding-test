package neetcode.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    // 재귀
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Integer.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
    }

    // BFS
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
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

            result++;
        }

        return result;
    }

    // DFS
    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> treeNodeStack = new Stack<>();
        Stack<Integer> levelStack = new Stack<>();
        treeNodeStack.push(root);
        levelStack.push(1);

        int result = 0;
        while (!treeNodeStack.isEmpty()) {
            if (treeNodeStack.peek() != null) {
                TreeNode treeNode = treeNodeStack.pop();
                int level = levelStack.pop();
                result = Integer.max(result, level);

                if (treeNode.left != null) {
                    treeNodeStack.push(treeNode.left);
                    levelStack.push(level + 1);
                }

                if (treeNode.right != null) {
                    treeNodeStack.push(treeNode.right);
                    levelStack.push(level + 1);
                }
            }
        }

        return result;
    }
}
