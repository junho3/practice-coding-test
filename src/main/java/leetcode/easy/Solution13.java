package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {

    private final Map<Character, Integer> map = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );

    public int romanToInt(String s) {

        // 시간 복잡도 O(N)
        // 공간 복잡도 O(1)

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000


//        I (1) can be placed before V (5) and X (10) to make 4 and 9.
//        X (10) can be placed before L (50) and C (100) to make 40 and 90.
//        C (100) can be placed before D (500) and M (1000) to make 400 and 900.
        // "MCMXCIV"

        int n = s.length();

        int total = 0;
        for (int i = 0; i < n; i++) {
            int number = map.get(s.charAt(i));

            if (i + 1 < n && number < map.get(s.charAt(i + 1))) {
                total -= number;
            } else {
                total += number;
            }
        }

        return total;
    }
}
