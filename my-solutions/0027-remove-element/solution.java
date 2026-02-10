class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int k=0,n=nums.length,count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val) 
            {
                nums[k++]=nums[i]; 
                count++;
            }
        }
        return count;
    }
}
