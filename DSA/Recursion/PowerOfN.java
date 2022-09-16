package GitCode.DSA.Recursion;

public class PowerOfN {
    public static void main(String[] args) {
        int num=2;
        int pow=7;
        System.out.println(recursion(num,pow));
    }

    static int recursion(int num,int pow)
    {
        if(pow==1)
            return num;
        if(pow==0)
            return 1;
        if(pow%2==0)
            return recursion(num*num,pow/2);
        else return num * recursion(num*num,pow/2);
    }
}
