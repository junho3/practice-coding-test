package neetcode.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        // 1, 2, 3, 4
        // head가 2일 때

        while (curr != null) {
            // 다음 값에 3(2.next) 셋팅
            next = curr.next;

            // 2.next에 1(이전 값) 셋팅
            curr.next = prev;

            // 이전 값에 2(현재 값) 셋팅
            prev = curr;

            // 현재 값이 3(다음 값) 셋팅
            curr = next;
        }

        return prev;
    }
}
