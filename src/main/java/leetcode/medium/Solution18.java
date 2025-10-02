package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // 시간복잡도 O(N^3)
        // 공간복잡도 O(1)

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            long iNum = nums[i];

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long jNum = nums[j];

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long leftNum = nums[left];
                    long rightNum = nums[right];

                    long sum = iNum + jNum + leftNum + rightNum;

                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        set.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
