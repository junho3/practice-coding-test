package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num , 0) + 1);
        }

        boolean result = true;
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            if (set.contains(data.getValue())) {
                result = false;
                break;
            }

            set.add(data.getValue());
        }

        return result;
    }
}
