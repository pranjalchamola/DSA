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
        System.out.println(heightOfMachine(arr,0,right,treeSize));
    }

    static int heightOfMachine(int[] arr,int left,int right,int treeSize)
    {
        if(left>right)
            return left;
        int mid=left+(right-left)/2;
        if(woodGained(arr,mid)==treeSize)
            return mid;
        else if (woodGained(arr,mid)>treeSize) {
            return heightOfMachine(arr,mid+1,right,treeSize);
        }
        else return heightOfMachine(arr,left,mid+1,treeSize);
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
