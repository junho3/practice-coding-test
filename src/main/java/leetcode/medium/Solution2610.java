package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<HashSet<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            boolean isNotInserted = true;
            // 1. set에 값이 있는지 확인
            // 2. 없으면 index = 0에 insert
            // 3. 있으면 index++에 insert
            for (int i = 0; i < result.size(); i++) {
                if (!result.get(i).contains(num)) {
                    result.get(i).add(num);
                    isNotInserted = false;
                    break;
                }
            }

            if (isNotInserted) {
                HashSet<Integer> set = new HashSet<>();
                set.add(num);
                result.add(set);
            }
        }

        return result.stream()
            .map(it -> it.stream().toList())
            .toList();
    }
}
