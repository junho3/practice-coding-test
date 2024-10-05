package leetcode.medium;

public class Solution151 {
    public String reverseWords(String s) {
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Input: s = "  hello world  "
//        Output: "world hello"

        // 1. s 순회 startIndex 선언 > int = n부터 시작

        // 2. 글자가 나오면 Index 할당

        // 3. 공백이 나오면 Index (i + 1)까지 추출

        // 4. StringBuilder에 추가
        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");
        int n = words.length;
        for (int i = n - 1; i >= 0; i--) {
            String word = words[i];

            if (!word.isEmpty()) {
                sb.append(" ");
                sb.append(word);
            }
        }

        return sb.toString().trim();
    }
}
