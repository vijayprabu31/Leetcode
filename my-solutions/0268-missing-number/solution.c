int missingNumber(int* nums, int numsSize)
{
    int n=numsSize;
    int i;
    int s=0;
    int a=(n*(n+1))/2;
    for(i=0;i<n;i++)
    {
        s+= nums[i];
    }
    return a-s;
}
