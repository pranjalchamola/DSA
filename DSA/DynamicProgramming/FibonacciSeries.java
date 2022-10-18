package GitCode.DSA.DynamicProgramming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[11];
        System.out.println(series(n,arr));
    }

    static int series(int n,int[] arr)
    {
        if(n<=1)
            return n;
        if(arr[n]!=0)
            return arr[n];
        System.out.println(n);
        int sum=series(n-1,arr) + series(n-2,arr);
        arr[n]=sum;
        return sum;
    }
}
