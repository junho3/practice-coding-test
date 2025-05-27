package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int left = 0;
            int right = result.size();

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (num > result.get(mid)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left < result.size()) {
                result.set(left, num);
            } else {
                result.add(num);
            }
        }

        return result.size();
    }
}
