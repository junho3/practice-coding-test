package leetcode.medium;

import java.util.HashMap;

public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        // TODO HashMap 방식은 시간 복잡도가 큼

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (int l = 0; l < s2.length(); l++) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            int size = 0;
            for (int r = l; r < s2.length(); r++) {
                char ch = s2.charAt(r);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) < map2.get(ch)) {
                    break;
                }

                if (map1.get(ch).equals(map2.get(ch))) {
                    size++;
                }

                if (map1.size() == size) {
                    return true;
                }
            }
        }

        return false;
    }
}
