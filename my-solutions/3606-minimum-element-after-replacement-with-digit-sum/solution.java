class Solution 
{
    public int minElement(int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        int n=nums.length,k=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a=nums[i],sum=0;
            while(a>0)
            {
                int r=a%10;
                sum+=r;
                a=a/10;
            }
            arr[k++]=sum;
        }
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}
