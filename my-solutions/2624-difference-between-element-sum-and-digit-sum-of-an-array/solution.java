class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            a=a+nums[i];
            int x=nums[i];
            while(x>0)
            {
                int m=x%10;
                b=b+m;
                x=x/10;
            }
        }
        return a-b;
    }
}
