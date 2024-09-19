package neetcode.arrays_hasing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str.length())
                    .append("#")
                    .append(str);
        }

        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // 글자 길이가 10(2자리) 이상인 경우를 처리 하기 위함
            int length = Integer.valueOf(str.substring(i, j));

            // 글자가 끝나는 위치
            i = j + 1 + length;

            // # 구분자 다음에 오는 글자 위치 (j + 1)부터 글자가 끝나는 위치
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}
