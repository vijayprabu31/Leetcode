class Solution 
{
    public int xorOperation(int n, int s) 
    {
        int a=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(s+(2*i));
            a=a^arr[i];
        }
        return a;
    }
}
