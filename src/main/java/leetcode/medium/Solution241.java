package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution241 {

    private Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        return dfs(expression);
    }

    private List<Integer> dfs(String expression) {
        if (map.containsKey(expression)) {
            return map.get(expression);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {
                String left = expression.substring(0 , i);
                String right = expression.substring(i + 1);

                List<Integer> leftNumbers = dfs(left);
                List<Integer> rightNumbers = dfs(right);

                for (int leftNumber : leftNumbers) {
                    for (int rightNumber : rightNumbers) {
                        if (ch == '+') {
                            result.add(leftNumber + rightNumber);
                        } else if (ch == '-') {
                            result.add(leftNumber - rightNumber);
                        } else {
                            result.add(leftNumber * rightNumber);
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        map.put(expression, result);

        return result;
    }
}
