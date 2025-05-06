package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution136 {
    public int singleNumber(int[] nums) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(n)
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.stream().findFirst().get();
    }
}
