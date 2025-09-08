void sortColors(int* nums, int numsSize) 
{
    int n=numsSize,i,j;
    for(i=0;i<n;i++) 
    {
        for(j=i+1;j<n;j++)
        {
            if(nums[i]>nums[j])
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
    }   
    for(i=0;i<n;i++)
    {
        printf("%d",nums[i]);
    }
}
