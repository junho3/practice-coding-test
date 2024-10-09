package leetcode.easy;

import java.util.HashMap;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Input: nums = [1,2,3,1], k = 3
//        Output: true
//        Input: nums = [1,2,3,1,2,3], k = 2
//        Output: false

        // 1. 맵을 만들고 Map<Number, Index>

        // 2. 같은 Number가 있는지 찾고

        // 3. 없으면 put()

        // 4. 있으면 Map에서 Index 비교
        boolean result = false;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                int j = map.get(num);

                if (Math.abs(i - j) <= k) {
                    result = true;
                    break;
                } else {
                    map.put(num, i);
                }
            } else {
                map.put(num, i);
            }
        }

        return result;
    }
}
