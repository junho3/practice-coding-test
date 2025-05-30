package neetcode.arrays_hasing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // 시간복잡도 O(n)
        // 공간복잡도 O(n)

        int [] result = new int [2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;

            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                break;
            } else {
                map.put(num, i);
            }
        }

        return result;
    }
}
