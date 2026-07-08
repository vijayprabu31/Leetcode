class Solution 
{
    public int countDigitOccurrences(int[] nums, int digit) 
    {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++)
        {
            int k=nums[i];
            while(k>0)
            {
                int r=k%10;
                if(r==digit)
                {
                    count++;
                }
                k/=10;
            }
        }
        return count;
    }
}
