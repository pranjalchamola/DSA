package GitCode.DSA.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Hashtable;

public class LC395LongestSubstringwithAtleast {
    public static void main(String[] args) {
        String s="bbaaacbd";
        int k=3,ans=0;
        System.out.println(longestSubstring(s,k));
    }

    static int longestSubstring(String s,int k)
    {
        if(k<2 || s.length()<1)
            return s.length();
        int ans=0,j=0,i=0;
        Hashtable<Character,Integer> table=new Hashtable<>();
        for (char ch: s.toCharArray())
            table.put(ch,table.getOrDefault(ch,0)+1);

        while (j<s.length())
        {
            Hashtable<Character,Integer> temp=new Hashtable<>();
            while (j<s.length() && table.get(s.charAt(j))>=k)
            {
                temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)+1);
                j++;
            }
            if(check(temp,k))
                ans=Math.max(ans,j-i);
            else {
                ans=Math.max(ans,longestSubstring(s.substring(i, j), k));
            }
            j++;
            i=j;
        }
        return ans;
    }

    static boolean check(Hashtable<Character,Integer> temp, int k)
    {
        for (int val:temp.values()
             ) {
            if(val<k)
                return false;
        }
        return true;
    }


//    public static void main(String[] args) {
//        String s="aaabbcd";
//        int k=2;
//        int ans=0;
//        char[] ch=s.toCharArray();
//        List<String> list=new ArrayList<>();
//        for(int i=0;i<s.length();i++)
//        {
//            boolean isOk=true;
//            for(int j=i;j<=s.length();j++)
//            {
//                isOk=true;
//                StringBuffer temp=new StringBuffer();
//                temp.append(s.substring(i,j));
//                HashMap<Character,Integer> map=new HashMap<>();
//                for(Character tempChar:temp.toString().toCharArray())
//                {
//                    map.put(tempChar, map.getOrDefault(tempChar,0)+1);
//                }
//                for (Integer num :map.values()
//                     ) {
//                    if(num<k)
//                    {
//                       isOk=false;
//                       break;
//                    }
//                }
//                if(isOk)
//                    ans=Math.max(ans,temp.length());
//            }
//        }
//        System.out.println(ans);
//    }
}
