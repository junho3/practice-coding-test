package leetcode.medium;

import leetcode.ListNode;

public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        ListNode firstTail = first;
        ListNode secondTail = second;

        while (head != null) {
            if (head.val < x) {
                firstTail.next = head;
                firstTail = firstTail.next;
            } else {
                secondTail.next = head;
                secondTail = secondTail.next;
            }

            head = head.next;
        }

        firstTail.next = second.next;
        secondTail.next = null;

        return first.next;
    }
}
