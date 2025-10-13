package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution2744 {
    public int maximumNumberOfStringPairs(String[] words) {

        // 시간 복잡도 O(N)
        // 공간 복잡도 O(N)

        int count = 0;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();

            if (set.contains(reverse)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}
