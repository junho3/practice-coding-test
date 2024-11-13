package leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length() - 9; i++) {
            String text = s.substring(i, i + 10);

            if (set.contains(text)) {
                result.add(text);
            } else {
                set.add(text);
            }
        }

        return result.stream()
            .toList();
    }
}
