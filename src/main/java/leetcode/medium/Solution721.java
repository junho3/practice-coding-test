package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Set<String>> emailGraph = new HashMap<>(); // <이메일, 이메일목록>
        Map<String, String> emailToName = new HashMap<>(); // <이메일, 이름>

        // 그래프 정의
        for (List<String> account : accounts) {
            String name = account.getFirst();

            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);

                emailToName.put(email, name);
                emailGraph.putIfAbsent(email, new HashSet<>());
                if (i > 1) {
                    String prev = account.get(i - 1);
                    emailGraph.get(prev).add(email);
                    emailGraph.get(email).add(prev);
                }
            }
        }

        Set<String> visited = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        // 그래프 순회
        for (String email : emailGraph.keySet()) {
            if (visited.contains(email)) {
                continue;
            }

            List<String> emails = new ArrayList<>();
            dfs(email, emailGraph, visited, emails);
            Collections.sort(emails);

            String name = emailToName.get(email);
            List<String> newData = new ArrayList<>();
            newData.add(name);
            newData.addAll(emails);

            result.add(newData);
        }

        return result;
    }

    private void dfs(String email, Map<String, Set<String>> emailGraph, Set<String> visited, List<String> emails) {
        visited.add(email);
        emails.add(email);

        for (String node : emailGraph.get(email)) {
            if (!visited.contains(node)) {
                dfs(node, emailGraph, visited, emails);
            }
        }
    }
}
