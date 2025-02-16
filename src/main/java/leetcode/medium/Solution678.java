package leetcode.medium;

public class Solution678 {
    public boolean checkValidString(String s) {
        // '(' 가 발생할 수 있는 최소, 최대 개수를 기억해야함
        // 최대가 - 가 되면 FALSE

        int minOpenCharacter = 0;
        int maxOpenCharacter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpenCharacter++;
                maxOpenCharacter++;
            } else if (c == ')') {
                minOpenCharacter--;
                maxOpenCharacter--;
            } else {
                minOpenCharacter--;
                maxOpenCharacter++;
            }

            if (maxOpenCharacter < 0) {
                return false;
            }

            // min을 최소 0으로 유지해야 되는 이유: ( * ) ) (
            if (minOpenCharacter < 0) {
                minOpenCharacter = 0;
            }
        }

        return minOpenCharacter == 0;
    }
}
