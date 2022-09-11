package GitCode.DSA.Recursion;

public class PeekOfMountain {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,2,1};
        System.out.println(peek(arr,0,arr.length-1));
    }

    static int peek(int[] arr, int left, int right)
    {
        if(left>=right)
            return left;
        int mid= left+(right-left)/2;
        if(arr[mid]<arr[mid+1])
        {
            return peek(arr,mid+1,right);
        }
        else
            return peek(arr,left,mid);
    }
}
