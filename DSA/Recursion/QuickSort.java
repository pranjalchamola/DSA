package GitCode.DSA.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,8,7,1,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int left,int right)
    {
        if(left>=right)
            return;
        int pivot=getPivot(arr,left,right);
        sort(arr,left,pivot-1);
        sort(arr,pivot+1,right);
    }

    static int getPivot(int[] arr, int left,int right)
    {
        int pivot=left;
        int count=0;
        for (int i=pivot;i<=right;i++) {
            if(arr[i]<arr[pivot])
                count++;
        }
        int pivotIndex=pivot+count;
        int temp1=arr[pivotIndex];
        arr[pivotIndex]=arr[pivot];
        arr[pivot]=temp1;
        while (left<pivotIndex && right>pivotIndex)
        {
            while (arr[left]<arr[pivotIndex])
                left++;
            while (arr[right]>arr[pivotIndex])
                right--;
            if(arr[left]>arr[pivotIndex] && arr[right]<arr[pivotIndex])
            {
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right++;
            }
        }
        return pivotIndex;
    }

}
