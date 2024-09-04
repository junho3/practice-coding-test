package neetcode.blind75.arrays_hasing;

import java.util.HashMap;
import java.util.Objects;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] firstCharArray = s.toCharArray();
        HashMap<Character, Integer> firstHashMap = new HashMap<>();
        char[] secondCharArray = t.toCharArray();
        HashMap<Character, Integer> secondHashMap = new HashMap<>();

        for (int i = 0; i < firstCharArray.length; i++) {
            if (firstHashMap.containsKey(firstCharArray[i])) {
                firstHashMap.put(firstCharArray[i], firstHashMap.get(firstCharArray[i]) + 1);
            } else {
                firstHashMap.put(firstCharArray[i], 1);
            }

            if (secondHashMap.containsKey(secondCharArray[i])) {
                secondHashMap.put(secondCharArray[i], secondHashMap.get(secondCharArray[i]) + 1);
            } else {
                secondHashMap.put(secondCharArray[i], 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : firstHashMap.entrySet()) {
            if (!Objects.equals(entry.getValue(), secondHashMap.get(entry.getKey()))) {
                return false;
            }
        }

        return true;
    }
}
