package leetcode.medium;

import java.util.HashMap;

public class Solution424 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxCount = 0;
        int result = 0;
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxCount = Math.max(maxCount, map.get(s.charAt(r)));

            while (r - l + 1 - maxCount > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }

        return result;
    }
}
