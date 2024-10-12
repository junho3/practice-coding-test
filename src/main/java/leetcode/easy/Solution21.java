package leetcode.easy;

import leetcode.ListNode;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]

        ListNode dummy = new ListNode();
        // 첫번째 loop에서 dummy.next와 temp.next는 같음
        // 두번째 loop에서 dummy.next는 유지되지만, temp.next는 temp`가 되므로 temp`.next로 되면서 차이가 발생
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                // list2.val을 dummy에 추가
                temp.next = list2;
                list2 = list2.next;
            } else {
                // list1.val을 dummy에 추가
                temp.next = list1;
                list1 = list1.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else if (list2 != null) {
            temp.next = list2;
        }

        return dummy.next;
    }
}
