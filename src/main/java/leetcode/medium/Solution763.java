package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution763 {
    public List<Integer> partitionLabels(String s) {
        // 1. 문자별로 마지막 인덱스를 맵에 기록
        // 2. 문자열을 순회
        // 3. 마지막 인덱스 갱신
        // 4. 마지막 인덱스에 도달하면 결과에 사이즈를 추가하고, 사이즈를 0으로 셋팅 후 2 ~ 4번 반복

        // [문자, 마지막 index]
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (index < map.get(ch)) {
                index = map.get(ch);
            }

            size++;

            if (i == index) {
                result.add(size);
                size = 0;
                index = 0;
            }
        }

        return result;
    }
}
