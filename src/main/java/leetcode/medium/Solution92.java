package leetcode.medium;

import leetcode.ListNode;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // prev: subHead 직전 노드
        // subHead: 자른 노드의 첫번째
        // subTail: 자른 노드의 마지막
        // tail: subTail의 다음 노드

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode subHead = prev.next;
        ListNode subTail = subHead;
        for (int i = 0; i < right - left; i++) {
            subTail = subTail.next;
        }

        ListNode tail = subTail.next;
        subTail.next = null;

        // subHead ~ subTail 역순
        ListNode before = null;
        ListNode curr = subHead;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = before;
            before = curr;
            curr = next;
        }

        prev.next = subTail;
        subHead.next = tail;

        return dummy.next;
    }
}
