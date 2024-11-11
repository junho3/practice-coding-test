package leetcode.medium;

import leetcode.ListNode;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        ListNode target = dummy;

        int length = 0;
        while (current.next != null) {
            if (length < n) {
                length++;
            } else if (length == n) {
                target = target.next;
            }

            current = current.next;
        }

        target.next = target.next.next;

        return dummy.next;
    }
}
