package leetcode.medium;

import leetcode.ListNode;

public class Solution143 {
    public void reorderList(ListNode head) {
        // 중앙 노드를 찾고
        // 중앙 노드의 다음 노드를 분리
        // 분리한 노드를 역순으로 재정렬 (B), 기존 노드 (A)
        // A와 B를 번갈아가며 정렬

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
