package GitCode.DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,7,9};
        int target=4;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int left, int right)
    {
        if(left>right)
            return -1;
        int mid= left+(right-left)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]<target)
            return search(arr,target,mid+1,right);
        else return search(arr,target,left,mid-1);
    }
}
