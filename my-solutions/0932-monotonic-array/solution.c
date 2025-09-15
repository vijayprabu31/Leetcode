bool isMonotonic(int* nums, int numsSize) 
{
    int n=numsSize;
    if(n==1 || n==2)
    {
        return true;
    }
    int a=nums[n-1]-nums[0];
    if(a>=0)
    {
        for(int i=0;i<n-1;i++)
        {
            if((nums[i+1]-nums[i])<0)
            {
                return false;
            }
        }
        return true;
    }
    else
    {
        for(int i=0;i<n-1;i++)
        {
            if((nums[i]-nums[i+1])<0)
            {
                return false;
            }
        }
        return true;
    }
}
