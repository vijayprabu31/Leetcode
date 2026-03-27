class Solution 
{
    public int largestSumAfterKNegations(int[] nums, int k) 
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0 && k>0)
            {
                nums[i]=-nums[i];
                k--;
            }
        }
        if(k%2==1)
        {
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            a=a+nums[i];
        }
        return a;
    }
}
