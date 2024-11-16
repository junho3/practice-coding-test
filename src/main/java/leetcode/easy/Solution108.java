package leetcode.easy;

import neetcode.trees.TreeNode;

import java.util.Arrays;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        // 1. nums를 파라미터로 받고

        // 2. nums의 중간을 선택해서 TreeNode 셋팅

        // 3. nums[0 ~ mid] 까지 left, nums[mid + 1 ~ length]까지 right

        return dfs(nums);
    }

    private TreeNode dfs(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = nums.length / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(Arrays.copyOfRange(nums, 0, mid));
        node.right = dfs(Arrays.copyOfRange(nums, mid + 1, nums.length));

        return node;
    }
}
