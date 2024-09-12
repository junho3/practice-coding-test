package neetcode.linkedlist;

import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode curr = head;

        boolean result = false;
        while (curr != null) {
            if (hashSet.contains(curr)) {
                result = true;
                break;
            }
            hashSet.add(curr);
            curr = curr.next;
        }

        return result;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        boolean result = false;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                result = true;
                break;
            }
        }

        return result;
    }
}
