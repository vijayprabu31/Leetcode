class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
       int n=nums.length;
       int a[]=new int[2],k=0;
       boolean arr[]=new boolean[n];
       for(int i=0;i<n;i++)
       {
        if(arr[nums[i]]==true)
            a[k++]=nums[i];
        else
            arr[nums[i]]=true;
       }
       return a;
    }
}
