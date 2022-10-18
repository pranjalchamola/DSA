package GitCode.DSA.HashMap;

import java.util.*;

public class LC347TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums={1};
        int k=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        for(var key:map.keySet())
        {
            if(bucket[map.get(key)]==null)
                bucket[map.get(key)]=new ArrayList<Integer>();
            bucket[map.get(key)].add(key);
        }

        int[] ans=new int[k];
        int index=0;
        for(int i=bucket.length-1; i>=0 && index<k;i--)
        {
            if(bucket[i]!=null)
            {
                while(bucket[i].size()>0 && index<k)
                {
                    ans[index++]=bucket[i].get(0);
                    bucket[i].remove(0);
                }
            }
        }
        return ans;
    }
}
