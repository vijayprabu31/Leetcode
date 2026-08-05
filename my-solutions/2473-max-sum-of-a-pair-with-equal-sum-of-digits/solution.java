class Solution 
{
    public int maximumSum(int[] nums) 
    {
        int[] maxVal=new int[82]; 
        int max=-1;
        for (int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            int sum=0;
            while (a>0)
            {
                sum+=a%10;
                a/=10;
            }
            if (maxVal[sum]>0)
            {
                max=Math.max(max,maxVal[sum]+nums[i]);
            }
            maxVal[sum]=Math.max(maxVal[sum],nums[i]);
        }
        return max;
    }
}
