int maximumDifference(int* nums, int numsSize) 
{
    int n=numsSize;
    int max=-1;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]<nums[j])
            {
                max=fmax(max,nums[j]-nums[i]);
            }
        }
    }
    return max;
}
