class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        int k=1,sum=0;
        for(int i=0;i<gain.length;i++)
        {
            sum=arr[i]+gain[i];
            arr[k++]=sum;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
