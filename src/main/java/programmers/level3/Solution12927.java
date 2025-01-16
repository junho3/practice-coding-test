package programmers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution12927 {
    public long solution(int n, int[] works) {
        // PriorityQueue로 가장 큰 수가 0번에 위치하도록 함
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            queue.add(work);
        }

        while (n > 0) {
            int work = queue.poll();

            // 0번 숫자가 0이라는 것은 모든 숫자가 0이라는 의미
            if (work == 0) {
                break;
            }

            queue.add(work - 1);
            n = n - 1;
        }

        long answer = 0;
        for (int work : queue) {
            answer = answer + (work * work);
        }

        return answer;
    }
}
