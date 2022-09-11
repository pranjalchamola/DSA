package GitCode.DSA.Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=5;
        System.out.println(fib(num));
    }

    static int fib(int n)
    {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
