package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {

    private final List<String> result = new ArrayList<>();
    private final String[] words = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return result;
        }

        dfs(digits, "", 0);
        return result;
    }

    private void dfs(String digits, String letter, int i) {
        if (digits.length() == letter.length()) {
            result.add(letter);
            return;
        }

        String word = words[digits.charAt(i) - '0'];
        for (char ch : word.toCharArray()) {
            dfs(digits, letter + ch, i + 1);
        }
    }
}
