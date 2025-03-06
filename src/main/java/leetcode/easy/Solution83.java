package leetcode.easy;

import leetcode.ListNode;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;

            if (next != null && current.val == next.val) {
                current.next = next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
