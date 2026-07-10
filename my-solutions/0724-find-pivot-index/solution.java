class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int i=0,j=nums.length-1;
        int r=0,l=0;
        for (int k = 1;k<nums.length;k++) 
        {
            r+=nums[k];
        }
        while(i<j)
        {
            
            if(l==r)
                return i;
            r-=nums[i+1];
            l+=nums[i++];
        }
        return (l==r)?i:-1;
    }
}
