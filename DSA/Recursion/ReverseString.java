package GitCode.DSA.Recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str="abcde";
        char[] ans=str.toCharArray();
        reverse(ans,0,ans.length-1);
        System.out.println(Arrays.toString(ans));
    }

    static void reverse(char[] str, int left, int right)
    {
        if(left>=right)
            return;
        swap(str,left,right);
        reverse(str,left+1,right-1);
    }

    static void swap(char[] str, int left, int right)
    {
        char temp=str[right];
        str[right]=str[left];
        str[left]=temp;
    }
}
