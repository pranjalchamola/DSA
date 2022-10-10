package GitCode.DSA.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC632SmallestRangeCovering {
    public static void main(String[] args) {
        List<List<Integer>> nums= new ArrayList<>();
        nums.add(Arrays.asList(4,10,15,24,26));
        nums.add(Arrays.asList(0,9,12,20));
        nums.add(Arrays.asList(5,18,22,30));
        System.out.println(nums);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int diff=Integer.MAX_VALUE;
        int[] ans={0,0};
        int maxIndex=-2;
        int[] flag=new int[nums.size()];
        for(int i=0;i<flag.length;i++)
        {
            flag[i]=nums.get(i).size()-1;
        }
        System.out.println(Arrays.toString(flag));
        while(true)
        {
            if(maxIndex>=0)
                flag[maxIndex]=flag[maxIndex]-1;
            if(maxIndex>=0 && flag[maxIndex]<0)
                break;
            for(int i=0;i<flag.length;i++)
            {
                if(nums.get(i).get(flag[i])<min)
                    min=nums.get(i).get(flag[i]);
                if(nums.get(i).get(flag[i])>max)
                {
                    maxIndex=i;
                    max=nums.get(i).get(flag[i]);
                }
            }
            if(max-min<=diff)
            {
                ans[0]=min;
                ans[1]=max;
                diff=max-min;
            }
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
        }
        System.out.println(Arrays.toString(ans));
    }
}
