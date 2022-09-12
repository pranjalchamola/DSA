package GitCode.DSA.Recursion;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr={5,17,100,11};
        int sum=0;
        for (int num:arr
             ) {
            sum+=num;
        }
        System.out.println(minPages(arr,0,sum,4,0));
    }

    static int minPages(int[] arr, int left, int right, int students, int ans)
    {
        if(left>right)
            return ans;
        int mid=(left+right)/2;

        if(isTrue(arr,mid,students))
        {
            ans=mid;
            return minPages(arr,left,mid-1,students,ans);
        }
        else return minPages(arr,mid+1,right,students,ans);
    }

    static boolean isTrue(int[] arr, int mid, int students)
    {
        int sum=0;
        int studNum=1;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>mid)
            {
                studNum++;
                sum=arr[i];
                if(studNum>students || arr[i]>mid)
                    return false;
            }
            else sum+=arr[i];
        }
        return true;
    }
}
