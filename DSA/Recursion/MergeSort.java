package GitCode.DSA.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,6,4,87,5,43,2,56};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int left,int right)
    {
        if(left>=right)
            return;
        int mid=(left+right)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,right,mid);
    }

    static void merge(int[] arr,int left,int right,int mid)
    {
        int[] arrLeft=new int[(mid-left)+1];
        int[] arrRight=new int[right-mid];
        int mainIndex=left;
        for(int i=0;i<arrLeft.length;i++)
        {
            arrLeft[i]=arr[mainIndex++];
        }
        for(int i=0;i<arrRight.length;i++)
        {
            arrRight[i]=arr[mainIndex++];
        }
        int l=0;
        mainIndex=left;
        int r=0;
        while (l<arrLeft.length && r<arrRight.length)
        {
            if(arrLeft[l]<arrRight[r])
                arr[mainIndex++]=arrLeft[l++];
            else
                arr[mainIndex++]=arrRight[r++];
        }
        while (l<arrLeft.length)
        {
            arr[mainIndex++]=arrLeft[l++];
        }
        while (r<arrRight.length)
        {
            arr[mainIndex++]=arrRight[r++];
        }
    }
}
