package leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution692 {
    public List<String> topKFrequent(String[] words, int k) {
        // 시간 복잡도 O(n log k) n: words.length, k: 반환할 단어 개수 (파라미터 k)
        // 공간 복잡도 O(n) n: words.length

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
            Comparator.comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder())
                .thenComparing(Map.Entry::getKey)
        );

        queue.addAll(map.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.poll().getKey());
        }

        return result;
    }
}
