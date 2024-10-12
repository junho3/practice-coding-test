package leetcode.easy;

import leetcode.ListNode;

import java.util.HashSet;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        boolean result = false;
        while (curr != null) {
            if (set.contains(curr)) {
                result = true;
                break;
            } else {
                set.add(curr);
            }

            curr = curr.next;
        }

        return result;
    }
}
