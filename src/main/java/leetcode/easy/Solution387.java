package leetcode.easy;

import java.util.HashMap;

public class Solution387 {
    public int firstUniqChar(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int result = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                result = i;
                break;
            }
        }

        return result;
    }
}
