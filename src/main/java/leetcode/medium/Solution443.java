package leetcode.medium;

public class Solution443 {
    public int compress(char[] chars) {
//        Input: chars = ["a","a","b","b","c","c","c"]
//        Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

        int index = 0; // 문자가 시작하는 위치
        int characterReplaceIndex = 0; // 문자를 업데이트하는 위치
        int length = chars.length;

        while (index < length) {
            char character = chars[index];
            int count = 0; // 문자가 반복되는 회수

            while (index + count < length && character == chars[index + count]) {
                count++;
            }

            chars[characterReplaceIndex] = character;
            characterReplaceIndex++;

            if (count > 1) {
                String stringCount = String.valueOf(count);
                for (int i = 0; i < stringCount.length(); i++) {
                    chars[characterReplaceIndex] = stringCount.charAt(i);
                    characterReplaceIndex++;
                }
            }

            index = index + count;
        }

        return characterReplaceIndex;
    }
}
