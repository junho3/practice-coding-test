package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution414 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int[] maxNumbers = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int num : set) {
            if (num > maxNumbers[2]) {
                maxNumbers[0] = maxNumbers[1];
                maxNumbers[1] = maxNumbers[2];
                maxNumbers[2] = num;
            } else if (num > maxNumbers[1] && num < maxNumbers[2]) {
                maxNumbers[0] = maxNumbers[1];
                maxNumbers[1] = num;
            } else if (num > maxNumbers[0] && num < maxNumbers[1]) {
                maxNumbers[0] = num;
            }
        }

        if (set.size() > 2) {
            return maxNumbers[0];
        }

        return maxNumbers[2];
    }
}
