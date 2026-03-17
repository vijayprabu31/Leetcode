class Solution 
{
    public int firstUniqueEven(int[] nums) 
    {
       int arr[]=new int[101];
       for(int i:nums)
       {
            if(i%2==0)
            {
                arr[i]++;
            }
       }
       for(int i:nums)
       {
            if(arr[i]==1)
            {
                return i;
            }
       }
       return -1;
    }
}
