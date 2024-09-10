package neetcode.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // A 1(A2), 2(A4), 4(null)
        // B 1(B3), 3(B5), 5(null)

        ListNode dummy = new ListNode(); // null(null)
        ListNode tail = dummy; // null(null)

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;

                // 2. A1과 B3 비교: null > B1 > A1 > A2 > A4 > null
                // 3. A2와 B3 비교: null > B1 > A1 > A2 > A4 > null
                // 5. A4와 B5 비교: null > B1 > A1 > A2 > B3 > A4 > null
            } else {
                tail.next = list2;
                list2 = list2.next;
                // 1. A1과 B1 비교: null > B1 > B3 > B5 > null
                // 4. A4와 B3 비교: null > B1 > A1 > A2 > B3 > B5 > null
            }
            tail = tail.next;
        }

        if (list1 == null) {
            tail.next = list2;
            // 6. 남은 B를 붙임: null > B1 > A1 > A2 > B3 > A4 > B5 > null
        } else if (list2 == null) {
            tail.next = list1;
        }

        return dummy.next;
    }
}
