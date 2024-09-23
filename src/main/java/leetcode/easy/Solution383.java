package leetcode.easy;

import java.util.HashMap;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // magazine의 문자별 개수를 map에 저장
        HashMap<Character, Integer> map = new HashMap<>();
        for (char character : magazine.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        // ransomNote를 탐색하면서 map의 카운트를 -1
        for (char character : ransomNote.toCharArray()) {
            if (map.get(character) == null) {
                return false;
            }

            map.put(character, map.get(character) - 1);

            // map의 카운트가 -가 되지 않으면 true
            if (map.get(character) < 0) {
                return false;
            }
        }

        return true;
    }
}
