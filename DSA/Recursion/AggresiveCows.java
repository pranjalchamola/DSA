package GitCode.DSA.Recursion;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 6};
        Arrays.sort(arr);
        int left=0;
        System.out.println(Arrays.toString(arr));
        int right=arr[arr.length-1];
        int cows=2;
        System.out.println(checkMinDistance(arr,left,right,cows,0));
    }

    static int checkMinDistance(int[] arr,int left,int right,int cows,int ans)
    {
        if(left>right)
            return ans;
        int mid=left+(right-left)/2;
        if(isOk(arr,mid,cows))
        {
            ans=mid;
            return checkMinDistance(arr,mid+1,right,cows,ans);
        }
        else return checkMinDistance(arr,left,mid-1,cows,ans);
    }

    static boolean isOk(int[] arr, int mid,int cows)
    {
        int last=arr[0];
        int countCows=1;
        for (int j : arr) {
            if (j - last >= mid) {
                countCows++;
                last = j;
                if (countCows >= cows)
                    return true;
            }
        }
        return false;
    }
}
