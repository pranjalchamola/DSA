package GitCode.DSA.String;

public class LC8StringToIntegerATOI {
    public static void main(String[] args) {
        String s= "-6147483648";
        int total=0 , index=0, sign=1;

        //check if char is empty space
        while(s.charAt(index)==' ' && index<s.length())
            index++;

        //check signs
        if(s.charAt(index)=='-')
        {
            sign=-1;
            index++;
        }
        else if(s.charAt(index)=='+') {
            sign=1;
            index++;
        }

        while(index<s.length())
        {
            //check num is valid
            int num=s.charAt(index++)- '0';
            if(num<0 || num>9)
                break;

            //check if it is beyond number value
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < num)
            {
                if(sign==-1) {
                    total= Integer.MIN_VALUE;
                    break;
                }
                else {
                    total= Integer.MAX_VALUE;
                    break;
                }
            }

            total=total*10 + num;
        }

        System.out.println(total);
    }
}
