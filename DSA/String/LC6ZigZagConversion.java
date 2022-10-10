package GitCode.DSA.String;

import java.util.Arrays;

public class LC6ZigZagConversion {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=3;
        char[] ch=s.toCharArray();
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            sb[i]=new StringBuilder();
        int i=0;
        while(i<ch.length)
        {
            for(int j=0;j<numRows && i<ch.length;j++)
            {
                sb[j].append(ch[i++]);
            }
            for(int j=numRows-2;j>0 && i<ch.length;j--)
            {
                sb[j].append(ch[i++]);
            }
        }
        for(int j=1;j<numRows;j++)
        {
            sb[0].append(sb[j]);
        }
        System.out.println(sb[0].toString());
    }
}
