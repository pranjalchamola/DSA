package GitCode.DSA.Recursion;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,4,8,2,9};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int n)
    {
        if(n>= arr.length-1)
            return;
        int min=n;
        for(int i=n+1;i< arr.length;i++)
        {
            if(arr[min]>arr[i])
                min=i;
        }
        int temp=arr[n];
        arr[n]=arr[min];
        arr[min]=temp;

        sort(arr,n+1);
    }
}
