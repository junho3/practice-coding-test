package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
//        Input: nums = [0,1,2,4,5,7]
//        Output: ["0->2","4->5","7"]

        // 1. nums 순회

        // 2. 시작 숫자 저장

        // 3. i -> i + 1 이라면 i + 2 로 순회

        // 4. i -> i + 1 이 아니라면 OutPut에 저장

        int n = nums.length;

        if (n == 0) {
            return List.of();
        }

        if (n == 1) {
            return List.of(String.valueOf(nums[0]));
        }

        List<String> result = new ArrayList<>();
        int startNumber = nums[0];
        for (int i = 1; i < n; i++) {
            int beforeNumber = nums[i - 1];
            int number = nums[i];

            if (beforeNumber != number - 1) {
                if (startNumber == beforeNumber) {
                    result.add(String.valueOf(startNumber));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(startNumber);
                    sb.append("->");
                    sb.append(beforeNumber);

                    result.add(sb.toString());
                }

                startNumber = number;
            }

            if (i == n - 1) {
                if (startNumber == number) {
                    result.add(String.valueOf(startNumber));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(startNumber);
                    sb.append("->");
                    sb.append(number);

                    result.add(sb.toString());
                }
            }
        }

        return result;
    }
}
