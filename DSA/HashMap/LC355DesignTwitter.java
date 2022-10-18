package GitCode.DSA.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC355DesignTwitter {
    public static void main(String[] args) {
        postTweet(1,5);
        postTweet(2,4);
        follow(1,2);
        unfollow(1,2);
        follow(2,1);
        System.out.println(getNewsFeed(2));
    }

    static HashMap<Integer, ArrayList<Integer>> tweets=new HashMap<>();
    static HashMap<Integer, ArrayList<Integer>> follows=new HashMap<>();

    public static void postTweet(int userId, int tweetId) {
        if(tweets.get(userId)==null)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(tweetId);
            tweets.put(userId,temp);
        }
        else
        {
            var temp=tweets.get(userId);
            temp.add(tweetId);
            tweets.put(userId,temp);
        }
    }

    public static List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed=new ArrayList<>();
        if(follows.containsKey(userId))
        {
            ArrayList<Integer> followers=follows.get(userId);
            for(int i=0;i<followers.size();i++)
            {
                if(tweets.containsKey(followers.get(i))) {
                    var tweetsOf = tweets.get(followers.get(i));
                    for (var tw : tweetsOf)
                        newsFeed.add(tw);
                }
            }
        }
        else
        {
            var tweetsOf=tweets.get(userId);
            for(var tw:tweetsOf)
                newsFeed.add(tw);
        }
        return newsFeed;
    }

    public static void follow(int followerId, int followeeId) {
        if(follows.get(followerId)==null)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(followerId);
            temp.add(followeeId);
            follows.put(followerId,temp);
        }
        else
        {
            var temp=follows.get(followerId);
            temp.add(followeeId);
            follows.put(followerId,temp);
        }
    }

    public static void unfollow(int followerId, int followeeId) {
        if(follows.get(followerId)!=null)
        {
            var temp=follows.get(followerId);
            for(int i=0;i<temp.size();i++)
            {
                if(temp.get(i)==followeeId)
                    temp.remove(i);
            }
            follows.put(followerId,temp);
        }
    }
}
