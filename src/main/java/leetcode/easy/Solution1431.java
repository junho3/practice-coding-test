package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highCandy = 0;
        for (int candy : candies) {
            if (candy > highCandy) {
                highCandy = candy;
            }
        }

        List<Boolean> results = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= highCandy) {
                results.add(true);
            } else {
                results.add(false);
            }
        }

        return results;
    }
}
