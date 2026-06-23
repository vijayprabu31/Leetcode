class Solution 
{
    public int alternatingSum(int[] nums) 
    {
        int n=nums.length,count=0;
        if(n==0)
            return nums[0];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                count+=nums[i];
            }
            else
                count-=nums[i];
        }
        return count;
    }
}
