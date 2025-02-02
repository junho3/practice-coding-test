package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution131 {

    private final List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, 0, new ArrayList<>());
        return result;
    }

    private void dfs(String s, int index, List<String> palindromes) {
        if (index == s.length()) {
            result.add(palindromes);
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindromes(s, index, i)) {
                List<String> newPalindromes = new ArrayList<>(palindromes);
                newPalindromes.add(s.substring(index, i + 1));
                dfs(s, i + 1, newPalindromes);
            }
        }
    }

    private boolean isPalindromes(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
