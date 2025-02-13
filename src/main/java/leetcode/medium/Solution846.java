package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        // 1. map에 숫자별 카운트 기록
        // 2. hand 소팅
        // 3. map 카운트 체크

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(hand);
        for (int num : hand) {
            if (map.get(num) > 0) {
                int length = num + groupSize;
                for (int i = num; i < length; i++) {
                    if (map.getOrDefault(i, 0) == 0) {
                        return false;
                    }

                    map.put(i, map.get(i) - 1);
                }
            }
        }

        return true;
    }
}
