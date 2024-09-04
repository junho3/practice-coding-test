package neetcode.blind75.arrays_hasing;

import java.util.HashSet;

public class Contains_Duplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }

            hashSet.add(num);
        }

        return false;
    }
}
