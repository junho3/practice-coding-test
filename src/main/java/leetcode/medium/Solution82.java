package leetcode.medium;

import leetcode.ListNode;

public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                int num = head.val;
                while (head != null && head.val == num) {
                    head = head.next;
                }
                prev.next = head;
            } else {
                head = head.next;
                prev = prev.next;
            }
        }

        return dummy.next;
    }
}
