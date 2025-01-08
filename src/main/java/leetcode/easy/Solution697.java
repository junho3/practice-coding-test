package leetcode.easy;

import java.util.HashMap;

public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        // nums 순회

        // HashMap에 숫자 카운트 기록
        // HashMap에 숫자 시작 Index 기록

        // 숫자 카운트가 제일 높고, 길이가 가장 적은 것을 리턴
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> startIndexMap = new HashMap<>();
        int maxCount = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int count = countMap.getOrDefault(num, 0);
            if (count == 0) {
                countMap.put(num, count + 1);
                startIndexMap.put(num, i);
                continue;
            }
            countMap.put(num, count + 1);

            if (count > maxCount) {
                maxCount = count;
                shortestLength = i - startIndexMap.get(num) + 1;
            } else if (count == maxCount) {
                int length = i - startIndexMap.get(num) + 1;
                if (shortestLength > length) {
                    shortestLength = length;
                }
            }
        }

        return shortestLength == Integer.MAX_VALUE ? 1 : shortestLength;
    }
}
