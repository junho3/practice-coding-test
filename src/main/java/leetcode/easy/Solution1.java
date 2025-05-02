package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        // 시간복잡도: O(n)
        // 공간복잡도: O(n)

        int[] result = new int[2];
        // <Number, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                result[0] = map.get(num);
                result[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return result;
    }
}
