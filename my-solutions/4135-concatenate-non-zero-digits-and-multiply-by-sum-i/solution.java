class Solution 
{
    public long sumAndMultiply(int n) 
    {
        if(n<10) return (long)n*n;
        String a="";
        long sum=0;
        long res=0;
        while(n>0)
        {
            long r=n%10;
            if(r!=0)
            {
                sum+=r;
                a+=Long.toString(r);
            }
            n=n/10;
        }
        String reversed = new StringBuilder(a).reverse().toString();
        long p=Integer.parseInt(reversed);
        res=sum*p;
        return res;
    }
}
