package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(N)

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;
        for (int num : set) {
            // 처음 시작 점일 때 연속적인지 순회
            if (!set.contains(num - 1)) {
                int curr = num;
                int length = 1;

                // 다음 숫자가 존재할 때까지 순회하면서 길이 계산
                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                result = Math.max(result, length);
            }
        }

        return result;
    }
}
