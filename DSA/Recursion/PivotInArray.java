package GitCode.DSA.Recursion;

public class PivotInArray {
    public static void main(String[] args) {
        int[] arr={4,1,2};
        System.out.println(pivot(arr,0,arr.length-1));
    }

    static int pivot(int[] arr,int left,int right)
    {
        if(left==right)
            return left;
        int mid=left+(right-left)/2;
        if(arr[0]>arr[mid])
            return pivot(arr,left,mid);
        return pivot(arr,mid+1,right);
    }
}
