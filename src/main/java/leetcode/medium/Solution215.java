package leetcode.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }

        int largestNumber = 0;
        while (!queue.isEmpty()) {
            largestNumber = queue.poll();
            k--;

            if (k == 0) {
                break;
            }
        }

        return largestNumber;
    }
}
