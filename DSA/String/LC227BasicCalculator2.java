package GitCode.DSA.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LC227BasicCalculator2 {
    public static void main(String[] args) {
        int ans=0;
        String s="3+55 / 2";
        Stack<Integer> st=new Stack<>();
        char[] chArr=s.toCharArray();
        int current=0;
        char oper='+';
        for(int i=0;i<chArr.length;i++)
        {
            if(Character.isDigit(chArr[i]))
                current=current*10+chArr[i]-'0';
            if(!Character.isDigit(chArr[i]) && chArr[i]!=' '|| i==chArr.length-1)
            {
                if(oper=='+')
                    st.push(current);
                else if(oper=='-')
                    st.push(-current);
                else if(oper=='*')
                    st.push(st.pop()*current);
                else if(oper=='/')
                    st.push(st.pop()/current);

                oper=chArr[i];
                current=0;
            }
        }
        while (!st.isEmpty())
        {
            ans+=st.pop();
        }
        System.out.println(ans);
    }
}
