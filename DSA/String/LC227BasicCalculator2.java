package GitCode.DSA.String;

import java.util.ArrayList;
import java.util.HashMap;

public class LC227BasicCalculator2 {
    public static void main(String[] args) {
        String s="1+4+6";
        HashMap<Character, ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            ArrayList<Integer> temp= map.getOrDefault(s.charAt(i),new ArrayList<Integer>());
            temp.add(i);
            map.put(s.charAt(i),temp);
        }


    }
}
