package GitCode.DSA.String;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String str="Hello Pranjal here";
        int temp=str.length()-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' '|| i==0)
            {
                System.out.print(str.substring(i,temp+1));
                temp=i;
            }
        }
    }
}
