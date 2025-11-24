package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution355 {

    class Twitter_Bruteforce {

        private final List<int[]> tweets; // <userId, tweetId>
        private final Map<Integer, Set<Integer>> followMap; // <followerId, followeeId>
        private final int feedSize;

        public Twitter_Bruteforce() {
            tweets = new ArrayList<>();
            followMap = new HashMap<>();
            feedSize = 10;
        }

        public void postTweet(int userId, int tweetId) {
            tweets.add(new int[] {userId, tweetId});
        }

        public List<Integer> getNewsFeed(int userId) {
            Set<Integer> followeeIds = followMap.getOrDefault(userId, new HashSet<>());
            followeeIds.add(userId);

            List<Integer> newsFeeds = new ArrayList<>();
            int n = tweets.size();
            for (int i = n - 1; i >= 0; i--) {
                if (newsFeeds.size() == feedSize) {
                    break;
                }

                int[] tweet = tweets.get(i);
                if (followeeIds.contains(tweet[0])) {
                    newsFeeds.add(tweet[1]);
                }
            }

            return newsFeeds;
        }

        public void follow(int followerId, int followeeId) {
            if (!followMap.containsKey(followerId)) {
                followMap.put(followerId, new HashSet<>());
            }

            followMap.get(followerId).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if (followMap.containsKey(followerId)) {
                followMap.get(followerId).remove(followeeId);
            }
        }
    }
}
