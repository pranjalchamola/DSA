package GitCode.DSA.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,10,3,6,1,8};
        for(int i=0;i<arr.length;i++) {
            int n= arr.length-i-1;
            sort(arr, n);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int n)
    {
        if(n<1)
            return;
        sort(arr,n-1);
        if(arr[n]<arr[n-1])
        {
            int temp=arr[n];
            arr[n]=arr[n-1];
            arr[n-1]=temp;
        }
    }
}
