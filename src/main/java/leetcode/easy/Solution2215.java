package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> nums2Set = new HashSet<>();
        for (int num : nums2) {
            nums2Set.add(num);
        }

        List<Integer> nums1Result = new ArrayList<>();
        for (int num : nums1Set) {
            if (!nums2Set.contains(num)) {
                nums1Result.add(num);
            }
        }

        List<Integer> nums2Result = new ArrayList<>();
        for (int num : nums2Set) {
            if (!nums1Set.contains(num)) {
                nums2Result.add(num);
            }
        }

        return List.of(nums1Result, nums2Result);
    }
}
