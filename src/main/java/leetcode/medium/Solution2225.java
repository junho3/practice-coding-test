package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution2225 {
    public List<List<Integer>> findWinners(int[][] matches) {

        // 1. matches 순회
        // 2. 경기승자 set<Integer>, 경기패자<선수번호,패배숫자> map<Integer, Integer>
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            winners.add(winner);
            losers.put(loser, losers.getOrDefault(loser, 0) + 1);
        }

        // 3. 결과생성
        List<Integer> notLostPlayers = new ArrayList<>();
        for(int winner : winners) {
            if (!losers.containsKey(winner)) {
                notLostPlayers.add(winner);
            }
        }

        List<Integer> onlyOneLostPlayers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> loser : losers.entrySet()) {
            if (loser.getValue() == 1) {
                onlyOneLostPlayers.add(loser.getKey());
            }
        }

        return List.of(
            notLostPlayers.stream().sorted().toList(),
            onlyOneLostPlayers.stream().sorted().toList());
    }
}
