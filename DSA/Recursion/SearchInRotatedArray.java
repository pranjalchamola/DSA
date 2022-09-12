package GitCode.DSA.Recursion;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int target=7;
        int left=0;
        int right=arr.length-1;
        int pivot=pivot(arr,0,arr.length-1);
        if(target<arr[0])
            left=pivot;
        else right=pivot-1;
        System.out.println(search(arr,left,right,target));
    }
    static int pivot(int[] arr,int left,int right)
    {
        if(left==right)
            return left;
        int mid=(left+right)/2;
        if(arr[0]>arr[mid])
            return pivot(arr,left,mid);
        else return pivot(arr,mid+1,right);
    }

    static int search(int[] arr,int left,int right,int target)
    {
        if(left>right)
            return -1;
        int mid=left+(right-left)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]<target)
            return search(arr,mid+1,right,target);
        else return search(arr,left,mid-1,target);
    }
}
