package leetcode.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2225 {
    public List<List<Integer>> findWinners(int[][] matches) {

        // 1. matches 순회
        // 2. 경기승자 set<Integer>, 경기패자<선수번호,패배숫자> map<Integer, Integer>
        // 2. 기존 코드 개선방법: 경기승자와 경기패자를 단일 Map으로 구성 > value가 0인건 승자
        final Map<Integer, Integer> players = new HashMap<>();
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            players.put(winner, players.getOrDefault(winner, 0));
            players.put(loser, players.getOrDefault(loser, 0) + 1);
        }

        // 3. 결과생성
        final List<Integer> notLostPlayers = players.entrySet().stream()
            .filter(player -> player.getValue() == 0)
            .map(Map.Entry::getKey)
            .sorted()
            .toList();

        final List<Integer> onlyOneLostPlayers = players.entrySet().stream()
            .filter(loser -> loser.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .toList();

        return List.of(notLostPlayers, onlyOneLostPlayers);
    }
}
