package neetcode.arrays_hasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return map.entrySet()
            .stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .limit(k)
            .map(it -> it.getKey())
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> frequent = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            frequent.add(new ArrayList<>());
        }

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        map.entrySet().forEach(it -> frequent.get(it.getValue()).add(it.getKey()));

        int[] result = new int[k];
        int resultIndex = 0;
        for (int i = frequent.size() - 1; i >= 0; i--) {
            for (int num : frequent.get(i)) {
                result[resultIndex++] = num;
                if (resultIndex == k) {
                    return result;
                }
            }
        }

        return new int[0];
    }
}
