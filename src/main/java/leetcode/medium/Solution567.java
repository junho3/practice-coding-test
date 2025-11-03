package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;

public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int[] s1Arr = new int[26];
        for (char ch : s1.toCharArray()) {
            s1Arr[ch - 'a']++;
        }

        int[] windows = new int[26];
        int left = 0;
        int right = 0;
        while (right < s2.length()) {
            windows[s2.charAt(right) - 'a']++;
            right++;

            if (right - left > s1.length()) {
                windows[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(s1Arr, windows)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkInclusion_map(String s1, String s2) {
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
