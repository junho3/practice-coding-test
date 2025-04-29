package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        // 1. task별 카운트 집계
        Map<Character, Integer> map = new HashMap<>();
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        // 2. 카운트를 우선순위 큐에 넣음
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(map.values());

        // 3. 카운트가 많은 것부터 사이클만큼 처리
        int cycle = n + 1;
        int time = 0;
        while (!queue.isEmpty()) {
            List<Integer> jobs = new ArrayList<>();

            for (int i = 0; i < cycle; i++) {
                if (!queue.isEmpty()) {
                    jobs.add(queue.poll());
                }
            }

            // 4. 처리한 카운트가 1이상이면 다시 큐에 넣고
            for (int count : jobs) {
                if (count - 1 > 0) {
                    queue.add(count - 1);
                }
            }

            // 5. 큐에 카운트가 존재하면 사이클만큼 시간 추가
            // 6. 큐에 카운트가 없으면(마지막 사이클) 처리한 개수만큼 시간 추가
            time += queue.isEmpty() ? jobs.size() : cycle;
        }

        return time;
    }
}
