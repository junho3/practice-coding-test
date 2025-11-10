package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {

    // 배열 nums가 주어졌을 때 과반수 이상인 숫자를 리턴하는 문제

    public int majorityElement(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(1)

        int majority = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else {
                count--;

                // 과반수 원소는 "투표를 붙이면" 언젠가는 살아남는다는 아이디어
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        return majority;
    }

    public int majorityElement_map(int[] nums) {
        int n = nums.length;

        // <숫자, 카운트>
        Map<Integer, Integer> map = new HashMap<>();
        int majorityElement = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (num == majorityElement) {
                count++;
            } else {
                int numCount = map.get(num);

                if (numCount > count) {
                    majorityElement = num;
                    count = numCount;
                }
            }
        }

        return majorityElement;
    }
}
