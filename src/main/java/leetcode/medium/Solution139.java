package leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        boolean[] results = new boolean[s.length() + 1];

        for (int end = 1; end < s.length(); end++) {
            for (int start = 0; start < end; start++) {
                final String text = s.substring(start, end);

                if (results[start] && words.contains(text)) {
                    results[end] = true;
                    break;
                }
            }
        }

        return results[s.length()];
    }
}
