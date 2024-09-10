package neetcode.linkedlist;

import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode curr = head;

        boolean result = false;
        while (curr.next != null) {
            if (hashSet.contains(curr.val)) {
                result = true;
                break;
            }
            hashSet.add(curr.val);
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
