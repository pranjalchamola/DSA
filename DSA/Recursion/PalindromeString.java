package GitCode.DSA.Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str= "abbccbba";
        System.out.println(palindrom(str,0));
    }

    static boolean palindrom(String str, int n)
    {
        if(str.length()/2<n)
            return true;
        if(str.charAt(n)!=str.charAt(str.length()-n-1))
            return false;
        return palindrom(str,n+1);
    }
}
