package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 1. 그래프를 만들기 위한 사전 준비
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // 2. 코스별 접근 가능한 수 체크 및 그래스 구성
        int[] accessibleCourseCount = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int target = prerequisite[0];
            int need = prerequisite[1];

            accessibleCourseCount[target]++;
            graph.get(need).add(target);
        }

        // 3. 큐를 만들어서 BFS 탐색 준비
        // 접근 가능한 수가 0인 경우는 시작 노드라는 의미
        // 시작 노드부터 BFS로 탐색하기 위함
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < accessibleCourseCount.length; i++) {
            if (accessibleCourseCount[i] == 0) {
                queue.add(i);
            }
        }

        // 4. 시작 노드부터 탐색
        int accessCourseCount = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            accessCourseCount++;

            for (int target : graph.get(course)) {
                // 타겟의 접근 가능한 경우의 수 차감
                accessibleCourseCount[target]--;

                // 타겟의 접근 가능한 경우의 수가 0이라는 것은 타겟에 자유롭게 접근할 수 있다는 의미이므로 타겟의 타겟을 추적하기 위해 큐에 넣음
                if (accessibleCourseCount[target] == 0) {
                    queue.add(target);
                }
            }
        }

        return accessCourseCount == numCourses;
    }
}
