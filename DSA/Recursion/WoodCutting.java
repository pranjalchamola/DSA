package GitCode.DSA.Recursion;

import java.util.Scanner;

public class WoodCutting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int treeSize=sc.nextInt();
        int[] arr=new int[length];
        int right=0;
        for (int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
            right=Math.max(right,arr[i]);
        }
        System.out.println(heightOfMachine(arr,0,right,treeSize,0));
    }

    static int heightOfMachine(int[] arr,int left,int right,int treeSize, int ans)
    {
        if(left>right)
            return ans;
        int mid=left+(right-left)/2;
        int woodGain= woodGained(arr,mid);
        if(woodGain==treeSize)
            return mid;
        else if (woodGain>treeSize) {
            ans=mid;
            return heightOfMachine(arr,mid+1,right,treeSize,ans);
        }
        else return heightOfMachine(arr,left,mid-1,treeSize,ans);
    }

    static int woodGained(int[] arr,int mid)
    {
        int woodGot=0;
        for (int j : arr) {
            if (j - mid > 0) {
                woodGot += j - mid;
            }
        }
        return woodGot;
    }
}
