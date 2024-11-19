package leetcode.easy;

import java.util.HashMap;

public class Solution136 {
    public int singleNumber(int[] nums) {
        // num, count
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0);

            if (count == 0) {
                map.put(num, 1);
            } else {
                map.remove(num);
            }
        }

        return map.keySet().stream().findFirst().get();
    }
}
