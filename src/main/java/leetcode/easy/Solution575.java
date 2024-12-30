package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution575 {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> candies = new HashSet<>();

        for (int i = 0; i < candyType.length; i++) {
            if (candies.size() == max) {
                break;
            }

            candies.add(candyType[i]);
        }

        return candies.size();
    }
}
