package leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();

            if (stone1 > stone2) {
                queue.add(stone1 - stone2);
            } else if (stone1 < stone2) {
                queue.add(stone2 - stone1);
            }
        }

        if (queue.size() == 1) {
            return queue.poll();
        }

        return 0;
    }
}
