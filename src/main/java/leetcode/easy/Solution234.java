package leetcode.easy;

import leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        ListNode current = head;
        while (current.next != null) {
            nums.add(current.val);
            current = current.next;
        }

        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            if (nums.get(i) != nums.get(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
