package leetcode.easy;

import java.util.HashMap;

public class Solution13 {
    public int romanToInt(String s) {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

//        I (1) can be placed before V (5) and X (10) to make 4 and 9.
//        X (10) can be placed before L (50) and C (100) to make 40 and 90.
//        C (100) can be placed before D (500) and M (1000) to make 400 and 900.
        // "MCMXCIV"
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > s.length() - 1 && s.charAt(i) < s.charAt(i + 1)) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
}
