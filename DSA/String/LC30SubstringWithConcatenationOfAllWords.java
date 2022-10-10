package GitCode.DSA.String;

import java.util.*;

public class LC30SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String s="wordgoodgoodgoodbestword";
        String[] words={"word","good","best","good"};
        int length=words[0].length();
        List<Integer> ans = new ArrayList<Integer>();
        HashMap<String,Integer> map=new HashMap<>();
        for (String word: words
             ) {
            map.put(word,1+(map.getOrDefault(word,0)));
        }

        for(int i=0;i<=s.length()-(length*words.length);i++)
        {
            HashMap<String,Integer> copyMap=new HashMap<>(map);
            int j=i;
            while (j<=s.length()-length)
            {
                if(copyMap.containsKey(s.substring(j,j+length)))
                {
                    int temp=copyMap.get(s.substring(j,j+length));
                    temp--;
                    if(temp==0)
                        copyMap.remove(s.substring(j,j+length));
                    else copyMap.put(s.substring(j,j+length),temp);

                    if(copyMap.isEmpty())
                    {
                        ans.add(i);
                        break;
                    }
                    j=j+length;
                }
                else break;
            }
        }

        System.out.println(ans);


        System.out.println(map);
    }

}
