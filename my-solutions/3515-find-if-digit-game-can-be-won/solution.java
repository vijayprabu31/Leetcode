class Solution 
{
    public boolean canAliceWin(int[] nums) 
    {
        int n=nums.length;
        int sum=0,s=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<10)
            {
                sum=sum+nums[i];
            }
            else
            {
                s=s+nums[i];
            }
        }
        if(sum==s)
        {
            return false;
        }
        return true;
    }
}
