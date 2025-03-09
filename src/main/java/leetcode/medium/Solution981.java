package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution981 {
    class TimeMap {

        private Map<String, List<Pair>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (map.containsKey(key)) {
                map.get(key).add(new Pair(value, timestamp));
                return;
            }

            map.put(key, new ArrayList<>(List.of(new Pair(value, timestamp))));
        }

        public String get(String key, int timestamp) {
            String result = "";
            if (!map.containsKey(key)) {
                return result;
            }

            List<Pair> pairs = map.get(key);
            int left = 0;
            int right = pairs.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (pairs.get(mid).timestamp <= timestamp) {
                    result = pairs.get(mid).value;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return result;
        }

        private static class Pair {
            private final String value;
            private final Integer timestamp;

            public Pair(String value, Integer timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }
        }
    }
}
