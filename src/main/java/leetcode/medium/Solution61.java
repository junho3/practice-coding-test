package leetcode.medium;

import leetcode.ListNode;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        // LinkedList 길이와 마지막 Node 구하기
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 회전해야할 크기 구하기
        int rotateSize = k % length;

        if (rotateSize == 0) {
            return head;
        }

        ListNode curr = head;
        for (int i = 0; i < length - rotateSize - 1; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;
    }
}
