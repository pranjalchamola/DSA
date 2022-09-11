package GitCode.DSA.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,7,9};
        int target=4;
        System.out.println(search(arr,target,0));
    }

    static int search(int[] arr,int target,int index)
    {
        if(index>arr.length-1)
            return -1;
        if(arr[index]==target)
            return index;
        return search(arr,target,index+1);
    }
}
