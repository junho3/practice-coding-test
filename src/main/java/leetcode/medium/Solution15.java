package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {

        // 시간복잡도 O(n^2)
        // 공간복잡도 O(n^2)

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
