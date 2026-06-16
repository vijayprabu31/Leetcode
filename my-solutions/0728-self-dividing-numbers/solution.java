class Solution 
{
    public List<Integer> selfDividingNumbers(int l, int r) 
    {
        List<Integer> a=new ArrayList<>();
        int t=1;
        for(int i=l;i<=r;i++)
        {
            if(divv(i))
            {
                a.add(i);
            }
        }
        return a;
    }
    public boolean divv(int i)
    {
        int n=i;
        while(n>0)
        {
            int s=n%10;
            if(s==0 || i%s!=0)
            {
                return false;
            }
            n=n/10;
        }
        return true;
    }
}
