package leetcode.easy;

import java.util.HashMap;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

        // 1. Map<num, index> 를 만들고

        // 2. nums를 순회하면서

        // 3. num[i] - target = result 에서 result가 있는지 Map을 검사

        // 4. 있으면 종료
        int[] result = new int[2];

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = target - nums[i];

            if (map.containsKey(number)) {
                result[0] = map.get(number);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
