package leetcode.medium;

import leetcode.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

        // 1. l1, l2를 순회

        // 2. 숫자 계산

        // 3. 10 이상 숫자 처리


        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        int upperNumber = 0;
        while (l1 != null || l2 != null || upperNumber > 0) {
            int sum = upperNumber;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int number = sum % 10;
            upperNumber = sum / 10;

            temp.next = new ListNode(number);
            temp = temp.next;
        }

        return dummy.next;
    }
}
