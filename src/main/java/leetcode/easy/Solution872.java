package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfs(root1, list1);
        dfs(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    private void dfs(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.left != null) {
            dfs(treeNode.left, list);
        }

        if (treeNode.right != null) {
            dfs(treeNode.right, list);
        }

        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
        }
    }
}
