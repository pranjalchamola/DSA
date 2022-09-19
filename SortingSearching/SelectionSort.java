package GitCode.SortingSearching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,7,3,6,5,8,9};
        for (int i=0;i< arr.length-1;i++)
        {
            int min=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            swap(arr,min,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
