package leetcode.easy;

import leetcode.ListNode;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        // 첫번째 loop에서 dummy.next와 temp.next는 같음
        // 두번째 loop에서 dummy.next는 유지되지만, temp.next는 temp`가 되므로 temp`.next로 되면서 차이가 발생
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
