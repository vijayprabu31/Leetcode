class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int a[]=new int[n];
        int b[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[k++]=nums[i];
        }
        int d=0;
        for(int i=n;i<nums.length;i++)
        {
            b[d++]=nums[i];
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            nums[c++]=a[i];
            nums[c++]=b[i];
        }
        return nums;
    }
}
