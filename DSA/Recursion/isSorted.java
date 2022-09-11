package GitCode.DSA.Recursion;

public class isSorted {
    public static void main(String[] args) {
        //Check if array is sorted or not
        int[] arr={2,4,5,6,8,7,9};
        System.out.println(isSorted(arr,arr.length-1));
    }

    static boolean isSorted(int[] arr,int index)
    {
        if(index<=1)
            return true;
        if(arr[index]<arr[index-1])
            return false;
        return isSorted(arr, index-1);
    }
}
