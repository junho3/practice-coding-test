package neetcode.arrays_hasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String orderedStr = str.chars()
                .sorted()
                .mapToObj(c -> (char) c)  // IntStream을 Stream<Character>로 변환
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)  // Stream을 String으로 변환
                .toString();

            if (!map.containsKey(orderedStr)) {
                map.put(orderedStr, new ArrayList<>());
            }

            map.get(orderedStr).add(str);
        }

        return map.values().stream().toList();
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] counts = new int[26];

            for (char character : str.toCharArray()) {
                counts[character - 'a']++;
            }

            String key = Arrays.stream(counts)
                .mapToObj(s -> s + "#")
                .collect(Collectors.joining());

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return map.values().stream().toList();
    }
}
