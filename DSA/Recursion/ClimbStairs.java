package GitCode.DSA.Recursion;

public class ClimbStairs {
    public static void main(String[] args) {
        //https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_10
        //Count ways to reach at top of n stairs.
        // Will Improve When I learn DP
        int nStairs=5;
        System.out.println(countStairs(nStairs));
    }

    static int countStairs(long nStairs)
    {
        if(nStairs==0)
            return 1;
        if(nStairs<0)
            return 0;
        return countStairs(nStairs-1)+countStairs(nStairs-2);
    }
}
