package programmers.level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution43163 {
    public int solution(String begin, String target, String[] words) {

        HashSet<String> set = new HashSet<>(Arrays.asList(words));

        if (!set.contains(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(begin);

        int answer = 0;
        while (!queue.isEmpty()) {

            for (int i = 0; i < queue.size(); i++) {
                String queueWord = queue.poll();

                if (queueWord.equals(target)) {
                    return answer;
                }

                for (String word : set.toArray(new String[set.size()])) {
                    if (isPossibleToChange(queueWord, word)) {
                        queue.add(word);
                        set.remove(word);
                    }
                }
            }

            answer++;
        }

        return answer;
    }

    private boolean isPossibleToChange(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
}
