package leetcode.easy;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        // 1. 첫글자만 대문자
        // 2. 전체 대문자
        // 2. 전체 소문자
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        if (isFirstCapital) {
            // 첫글자가 대문자라면 나머지 문자가 모두 대문자 혹은 소문자
            for (int i = 1; i < word.length() - 1; i++) {
                boolean isCapital1 = Character.isUpperCase(word.charAt(i));
                boolean isCapital2 = Character.isUpperCase(word.charAt(i + 1));

                if (isCapital1 != isCapital2) {
                    return false;
                }
            }
        } else {
            // 첫글자가 소문자라면 모든 문자가 소문자
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
