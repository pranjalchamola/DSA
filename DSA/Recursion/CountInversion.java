package GitCode.DSA.Recursion;

import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr=new int[]{3,8,7,1,2,3};
        System.out.println(sort(arr,0,5));
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int[] arr,int left,int right)
    {
        int inversion=0;
        if(left>=right)
            return inversion;
        int mid=left+(right-left)/2;
        inversion+=sort(arr,left,mid);
        inversion+=sort(arr,mid+1,right);
        inversion+=merge(arr,left,right,mid);
        return inversion;
    }

    static int merge(int[] arr, int left,int right,int mid)
    {
        int inversion=0;
        int[] arrLeft=new int[(mid-left)+1];
        int[] arrRight=new int[right-mid];
        int mainIndex=left;
        int lIndex=0;
        int rIndex=0;
        for(int i=0;i<(arrLeft.length+arrRight.length);i++)
        {
            if(lIndex<arrLeft.length)
                arrLeft[lIndex++]=arr[mainIndex++];
            else arrRight[rIndex++]=arr[mainIndex++];
        }
        mainIndex=left;
        lIndex=rIndex=0;
        while (lIndex<arrLeft.length && rIndex< arrRight.length)
        {
            if(arrLeft[lIndex]<arrRight[rIndex])
                arr[mainIndex++]=arrLeft[lIndex++];
            else {
                arr[mainIndex++] = arrRight[rIndex++];
                inversion+= arrLeft.length-lIndex;
            }
        }
        while (lIndex<arrLeft.length) {
            inversion++;
            arr[mainIndex++] = arrLeft[lIndex++];
        }
        while (rIndex< arrRight.length)
            arr[mainIndex++]=arrRight[rIndex++];

        return inversion;
    }
}
