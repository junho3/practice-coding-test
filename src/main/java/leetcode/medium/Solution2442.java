package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution2442 {

    public int countDistinctIntegers1(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(N)

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

            int reverse = 0;
            String text = String.valueOf(num);
            for (int i = text.length() - 1; i >= 0; i--) {
                char ch = text.charAt(i);

                reverse = (reverse * 10) + (ch - '0');
            }

            set.add(reverse);
        }

        return set.size();
    }

    public int countDistinctIntegers2(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(N)

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

            int temp = num;
            int reverse = 0;
            while (temp > 0) {
                reverse = (reverse * 10) + (temp % 10);
                temp = temp / 10;
            }

            set.add(reverse);
        }

        return set.size();
    }
}
