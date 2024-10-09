package leetcode.medium;

import java.util.HashSet;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
//        Input: nums = [100,4,200,1,3,2]
//        Output: 4

        // 1. HashSet 으로 중복 숫자 제거

        // 2. HashSet을 순회하면서 [1 > 2 > 3 > 100 > 4 > 200]

        // 3. 가장 긴 길이 구하기

        // 4. 시작 숫자만 순회해야 함 >> num - 1 에 값이 없을 때

        HashSet<Integer> setNums = new HashSet<>();
        for (int num : nums) {
            setNums.add(num);
        }

        int result = 0;
        for (int num : setNums) {
            if (!setNums.contains(num - 1)) {
                int longestLength = 1;
                int tempNum = num;

                boolean hasNext = true;
                while (hasNext) {
                    tempNum++;

                    if (setNums.contains(tempNum)) {
                        longestLength++;
                    } else {
                        hasNext = false;
                    }
                }

                if (longestLength > result) {
                    result = longestLength;
                }
            }
        }

        return result;
    }
}
