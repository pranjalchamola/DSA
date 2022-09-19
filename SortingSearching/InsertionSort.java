package GitCode.SortingSearching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,0,4,6,3,4,9,7};
        for (int i=1;i< arr.length;i++)
        {
            int temp=i;
            while (temp>0 && arr[temp-1]>arr[temp])
            {
                swap(arr,temp);
                temp--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i)
    {
        int temp = arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
    }
}
