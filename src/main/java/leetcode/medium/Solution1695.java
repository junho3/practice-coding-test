package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution1695 {
    public int maximumUniqueSubarray(int[] nums) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N)

        Set<Integer> set = new HashSet<>();

        int result = 0;
        int sum = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            int num = nums[right];

            while (set.contains(num)) {
                set.remove(nums[left]);
                sum = sum - nums[left];
                left++;
            }

            set.add(num);
            sum = sum + num;
            result = Math.max(result, sum);

            right++;
        }

        return result;
    }
}
