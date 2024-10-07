package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        // 1. strs 를 순회

        // 2. 키를 만들고

        // 3. 맵에 저장

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] alphabets = new int[26];

            for (char ch : str.toCharArray()) {
                alphabets[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int alphabet : alphabets) {
                sb.append("#");
                sb.append(alphabet);
            }
            String key = sb.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return map.values().stream().toList();
    }
}
