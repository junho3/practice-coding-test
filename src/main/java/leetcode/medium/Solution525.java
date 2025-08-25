package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution525 {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // <sum, sum이 발생한 첫 index>
        map.put(0, -1); // 가상의 index -1에 0을 초기화

        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum = sum - 1;
            } else {
                sum = sum + 1;
            }

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public int findMaxLength_Bruteforce(int[] nums) {
        // 시간복잡도 O(N^2)
        // 공간복잡도 O(1)

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int zero = 0;
            int one = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[i] == 0) {
                    zero++;
                } else {
                    one++;
                }

                if (zero == one) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }


}
