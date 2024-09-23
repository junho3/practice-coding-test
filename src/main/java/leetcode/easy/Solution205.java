package leetcode.easy;

import java.util.HashMap;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        if (sChars.length != tChars.length) {
            return false;
        }

        // {s1:t1, s2:t2}
        // "badc" >> {b:b, a:a, d:b, c:a}
        // "baba" >> {b:b, a:a, b:d, a:c}
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < sChars.length; i++) {
            if (sMap.get(sChars[i]) == null) {
                sMap.put(sChars[i], tChars[i]);
            }

            if (tMap.get(tChars[i]) == null) {
                tMap.put(tChars[i], sChars[i]);
            }

            if (sMap.get(sChars[i]) != tChars[i]) {
                return false;
            }

            if (tMap.get(tChars[i]) != sChars[i]) {
                return false;
            }
        }

        return true;
    }
}
