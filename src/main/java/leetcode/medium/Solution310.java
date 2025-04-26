package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0);
        }

        // 그래프 초기화
        List<Set<Integer>> graphs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graphs.add(new HashSet<>());
        }

        // 그래프 노드간 연결 관계 정의
        for (int[] edge : edges) {
            graphs.get(edge[0]).add(edge[1]);
            graphs.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] connectedNodeCount = new int[n]; // 연결된 노드의 개수
        for (int i = 0; i < graphs.size(); i++) {
            connectedNodeCount[i] = graphs.get(i).size();

            // 리프 노드를 큐에 삽입
            if (graphs.get(i).size() == 1) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            // 가장 중심에 있는 노드
            // n == 1 case: A - B - C - D - E >> 가장 중심 노드는 C만 존재 >> A -> C 2칸, E -> C 2간
            // n == 2 case: A - B - C - D - E - F >> 중심 노드가 C와 D 2개 존재 >> A -> C 2칸, F -> D 2칸
            if (n <= 2) {
                return new ArrayList<>(queue);
            }

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // 리프 노드 제거
                int leaveNode = queue.poll();
                n--;

                for (int connectedNode : graphs.get(leaveNode)) {
                    connectedNodeCount[connectedNode]--;

                    // 연결된 노드의 연결된 노드가 1개가 되었다는건 리프 노드가 되었다는 의미이므로 큐에 삽입
                    if (connectedNodeCount[connectedNode] == 1) {
                        queue.add(connectedNode);
                    }
                }
            }
        }

        return List.of();
    }
}
