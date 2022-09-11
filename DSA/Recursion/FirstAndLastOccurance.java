package GitCode.DSA.Recursion;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,8,8,8,8,8,9,9};
        int target=8;
        System.out.println(firstOccurance(arr,target,0,arr.length-1,-1));
        System.out.println(lastOccurance(arr,target,0,arr.length-1,-1));
    }

    static int firstOccurance(int[] arr,int target,int left, int right, int ans)
    {
        if(left>right)
            return ans;
        int mid=left+(right-left)/2;
        if(arr[mid]==target)
        {
            ans=mid;
            return firstOccurance(arr, target, left, mid-1, ans);
        }
        if(arr[mid]<target)
            return firstOccurance(arr,target,mid+1,right,ans);
        else return firstOccurance(arr,target,left,mid-1,ans);
    }
    static int lastOccurance(int[] arr,int target,int left, int right, int ans)
    {
        if(left>right)
            return ans;
        int mid=left+(right-left)/2;
        if(arr[mid]==target)
        {
            ans=mid;
            return lastOccurance(arr, target, mid+1, right, ans);
        }
        if(arr[mid]<target)
            return lastOccurance(arr,target,mid+1,right,ans);
        else return lastOccurance(arr,target,left,mid-1,ans);
    }
}
