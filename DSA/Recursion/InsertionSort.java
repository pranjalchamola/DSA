package GitCode.DSA.Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={3,5,2,7,1,5};
        sort(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int index)
    {
        if(index>=arr.length)
            return;
        int temp=index;
        while (temp>0&&arr[temp-1]>arr[temp]) {
            swap(arr, temp);
            temp--;
        }
        sort(arr,index+1);
    }

    static void swap(int[] arr, int i)
    {
        int temp = arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
    }
}
