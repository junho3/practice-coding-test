package leetcode.medium;

import java.util.Arrays;

public class Solution875 {
    public int minEatingSpeed(int[] piles, int h) {
        int startEatCount = 1;
        int endEatCount = Arrays.stream(piles).max().getAsInt();

        int result = endEatCount;
        while (startEatCount <= endEatCount) {
            int midEatCount = (startEatCount + endEatCount) / 2;

            // eatTime이 int 숫자 범위를 초과할 수 있음
            long eatTime = 0;
            for (int bananas : piles) {
                if (bananas % midEatCount == 0) {
                    eatTime = eatTime + (bananas / midEatCount);
                } else {
                    eatTime = eatTime + (bananas / midEatCount) + 1;
                }
            }

            if (eatTime > h) {
                startEatCount = midEatCount + 1;
            } else {
                // eatTime이 반드시 h와 같지 않은 케이스가 존재함
                endEatCount = midEatCount - 1;
                result = midEatCount;
            }
        }

        return result;
    }
}


//piles =
//    [312884470]
//h =
//    312884469
//
//1:312884470:156442235:2
//    1:156442234:78221117:5
//    1:78221116:39110558:9
//    1:39110557:19555279:17
//    1:19555278:9777639:33
//    1:9777638:4888819:65
//    1:4888818:2444409:129
//    1:2444408:1222204:257
//    1:1222203:611102:513
//    1:611101:305551:1025
//    1:305550:152775:2049
//    1:152774:76387:4097
//    1:76386:38193:8193
//    1:38192:19096:16385
//    1:19095:9548:32770
//    1:9547:4774:65540
//    1:4773:2387:131079
//    1:2386:1193:262267
//    1:1192:596:524974
//    1:595:298:1049948
//    1:297:149:2099896
//    1:148:74:4228169
//    1:73:37:8456338
//    1:36:18:17382471
//    1:17:9:34764942
//    1:8:4:78221118
//    1:3:2:156442235
//    1:1:1:312884470
