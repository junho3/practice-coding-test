package leetcode.medium;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        List<Integer> numbers = new ArrayList<>();
        dfs(root, numbers);

        return numbers.get(k - 1);
    }

    private void dfs(TreeNode node, List<Integer> numbers) {
        if (node.left != null) {
            dfs(node.left, numbers);
        }

        numbers.add(node.val);

        if (node.right != null) {
            dfs(node.right, numbers);
        }
    }
}
