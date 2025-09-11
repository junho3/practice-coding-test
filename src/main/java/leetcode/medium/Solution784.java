package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution784 {

    private final List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        dfs(s.toCharArray(), 0);

        return result;
    }

    private void dfs(char[] chars, int index) {
        if (chars.length == index) {
            StringBuilder sb = new StringBuilder();
            for (char ch : chars) {
                sb.append(ch);
            }

            result.add(sb.toString());
            return;
        }

        if (Character.isDigit(chars[index])) {
            dfs(chars, index + 1);
        } else {
            dfs(chars, index + 1);

            if (Character.isLowerCase(chars[index])) {
                chars[index] = Character.toUpperCase(chars[index]);
            } else {
                chars[index] = Character.toLowerCase(chars[index]);
            }

            dfs(chars, index + 1);
        }
    }
}
