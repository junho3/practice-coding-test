package leetcode.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution146 {
    class LRUCache {

        private int capacity;
        private Map<Integer, Integer> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new LinkedHashMap<>();
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.remove(key);
                map.put(key, value);

                return value;
            }

            return -1;
        }

        public void put(int key, int value) {
            map.remove(key);
            map.put(key, value);

            if (map.size() > capacity) {
                int firstKey = map.keySet().iterator().next();
                map.remove(firstKey);
            }
        }
    }
}
