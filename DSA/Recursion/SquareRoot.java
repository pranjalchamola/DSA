package GitCode.DSA.Recursion;

public class SquareRoot {
    public static void main(String[] args) {
        int target=2147395599;
        System.out.println(squareRoot(0,target,target,-1));
    }

    static int squareRoot(int left, int right, int target, int ans)
    {
        if(left>right)
            return ans;
        int mid=(left+right)/2;
        if(mid*mid==target)
            return mid;
        else if (mid*mid<target) {
            ans=mid;
            return squareRoot(mid+1,right,target,ans);
        }
        else return squareRoot(left,mid-1,target,ans);
    }

}
