class Solution 
{
    public int countEven(int num) 
    {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            int n=i,sum=0;
            while(n>0)
            {
                int r=n%10;
                sum+=r;
                n=n/10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
