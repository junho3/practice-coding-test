package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i< nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<Integer> result = new ArrayList<>();
        for (int number : set1) {
            if (set2.contains(number)) {
                result.add(number);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
