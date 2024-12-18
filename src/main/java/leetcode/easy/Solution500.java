package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution500 {
    public String[] findWords(String[] words) {
        final String firstLine = "qwertyuiop";
        final String secondLine = "asdfghjkl";
        final String thirdLine = "zxcvbnm";

        final List<String> result = new ArrayList<>();

        for(String word : words) {
            int pastLine = 0;
            boolean isAllContain = true;

            for (char ch : word.toCharArray()) {
                String lowWord = String.valueOf(ch).toLowerCase();

                int line;
                if (firstLine.contains(lowWord)) {
                    line = 1;
                } else if (secondLine.contains(lowWord)) {
                    line = 2;
                } else {
                    line = 3;
                }

                if (pastLine == 0) {
                    pastLine = line;
                } else if (pastLine != line) {
                    isAllContain = false;
                }
            }

            if (isAllContain) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
