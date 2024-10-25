package leetcode.easy;

import java.util.List;

public class Solution345 {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] result = s.toCharArray();
        while (i < j) {
            char iChar = s.charAt(i);
            char jChar = s.charAt(j);

            if (!vowels.contains(iChar)) {
                i++;
                continue;
            }

            if (!vowels.contains(jChar)) {
                j--;
                continue;
            }

            result[i] = jChar;
            result[j] = iChar;

            i++;
            j--;
        }

        return new String(result);
    }
}
