package GitCode.SortingSearching;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,7,8,1,5};
        for(int i=1;i< arr.length;i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i)
    {
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
