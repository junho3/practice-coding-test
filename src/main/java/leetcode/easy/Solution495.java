package leetcode.easy;

public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisoneDuration = 0;
        int lastPoisoneTime = 0;
        for (int time: timeSeries) {
            int poisoneTime = time + duration;

            if (time > lastPoisoneTime) {
                totalPoisoneDuration += duration;
                lastPoisoneTime = poisoneTime;
            } else if (poisoneTime > lastPoisoneTime) {
                totalPoisoneDuration += (poisoneTime - lastPoisoneTime);
                lastPoisoneTime = poisoneTime;
            }
        }

        return totalPoisoneDuration;
    }
}
