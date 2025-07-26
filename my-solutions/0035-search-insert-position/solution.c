int searchInsert(int* nums, int numsSize, int target) 
{
    int i,j,n,count=0;
    n=numsSize;
    for(i=0;i<n;i++)
    {
        if(nums[i]==target)
        {
            return i;
        }
    }
    for(i=0;i<n;i++)
    {
        if(nums[i]<target)
        {
            count++;
        }
    }
    return count;
}
