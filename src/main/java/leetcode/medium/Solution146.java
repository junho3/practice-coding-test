package leetcode.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution146 {
    class LRUCache {

        private final Map<Integer, Integer> cache;
        private final int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new LinkedHashMap<>();
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                int value = cache.get(key);
                cache.remove(key);
                cache.put(key, value);

                return value;
            }

            return -1;
        }

        public void put(int key, int value) {
            cache.remove(key); // LRU 캐시 특성상 동일한 키가 들어왔을 때 순번을 조정해줘야 함
            cache.put(key, value);

            if (cache.size() > capacity) {
                int firstKey = cache.keySet().iterator().next();
                cache.remove(firstKey);
            }
        }
    }
}
