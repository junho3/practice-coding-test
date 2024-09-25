package leetcode.easy;

import java.util.HashMap;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        boolean result = true;
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();

        // "abba", "dog cat cat dog"
        // "abba", "dog dog dog dog"
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charMap.get(ch) == null) {
                charMap.put(ch, word);
            }
            if (stringMap.get(word) == null) {
                stringMap.put(word, ch);
            }
            // 아래와 같이 변경할 수 있지만, 수행 시간이 더 늘어남
//            charMap.computeIfAbsent(ch, k -> word);
//            stringMap.computeIfAbsent(word, k -> ch);

            if (!charMap.get(ch).equals(word) || stringMap.get(word) != ch) {
                result = false;
                break;
            }
        }

        return result;
    }
}
