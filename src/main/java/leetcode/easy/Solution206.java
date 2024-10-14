package leetcode.easy;

import leetcode.ListNode;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
//        Input: head = [1 <,2 <,3 >,4 >,5]
//        Output: [5,4,3,2,1]
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }
}
