package leetcode.easy;

import java.util.HashMap;

public class Solution169 {
    public int majorityElement(int[] nums) {
        // [2,2,1,1,1,2,2]
        HashMap<Integer, Integer> map = new HashMap<>();

        int result = 0;
        for (int num : nums) {
            // HashMap에 num 별 카운트 기록
            map.put(num, map.getOrDefault(num, 0) + 1);

            // nums의 절반 이상이면 majorityElement 이므로
            if (map.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }

        return result;
    }
}
