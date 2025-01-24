package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Solution380 {

    class RandomizedSet {
        // <val, index>
        private Map<Integer, Integer> map;
        private List<Integer> list;

        public RandomizedSet() {
            // 초기화
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            // 있으면 return false;
            if (map.containsKey(val)) {
                return false;
            }

            // 없으면 삽입, return true;
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int index = map.get(val);
                // 지워질 index를 List의 마지막 값으로 대체
                list.set(index, list.get(list.size() - 1));
                map.put(list.get(index), index);

                map.remove(val);
                list.remove(list.size() - 1);

                return true;
            }
            // 항목이 있으면 제거
            // 항목이 없으면 return false, 있으면 return true
            return false;
        }

        public int getRandom() {
            // int getrandom ()은 현재 요소 세트에서 임의의 요소를 반환합니다
            // (이 메소드가 호출 될 때 적어도 하나의 요소가 존재하도록 보장됩니다).
            // 각 요소는 반환 될 확률이 동일해야합니다.
            Random rand = new Random();
            return list.get(rand.nextInt(list.size()));
        }
    }
}
