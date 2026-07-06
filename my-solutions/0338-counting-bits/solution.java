class Solution 
{
    public int[] countBits(int n) 
    {
        int arr[]=new int[n+1],count=0;
        if(n==0)
        {
            arr[0]=0;
            return arr;
        }
        else if(n==1)
        {
            arr[0]=0;
            arr[1]=1;
            return arr;
        }
        else
        {
            arr[0]=0;
            arr[1]=1;
            for(int i=2;i<=n;i++)
            {
                int x=i;
                count=0;
                while(x>0)
                {
                    int r=x%2;
                    if(r==1)
                    {
                        count++;
                    }
                    x=x/2;         
                }
                arr[i]=count;
            }
        }
        return arr;
    }
}
