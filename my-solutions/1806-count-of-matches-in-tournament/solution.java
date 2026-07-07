class Solution 
{
    public int numberOfMatches(int n) 
    {
        if(n<=1) return 0;
        if(n%2==0)
        {
            int a=n/2;
            return (n-a)+numberOfMatches(a);
        }
        else
        {
            int c=(n-1)/2;
            int b=c+1;
            return c+numberOfMatches(b);
        }
    }
}
