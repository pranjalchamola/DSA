package GitCode.DSA.String;
public class CheckDuplicateBitOperations {
    public static void main(String[] args) {
        String str="finding";
        int x=0;
        for(int i=0;i<str.length();i++)
        {
            int h=1;
            h=h<<str.charAt(i)-97;
            if((h&x)>0)
                System.out.println(str.charAt(i));
            else
                x=x|h;
        }
    }
}
