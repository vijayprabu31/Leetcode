class Solution 
{
    public int buyChoco(int[] p, int m) 
    {
        int n=p.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=p[i]+p[j];
                l.add(sum);
            }
        }
        Collections.sort(l);
        for(int x:l)
        {
            if(x<=m)
            {
                return m-x;
            }
        }
        return m;
    }
}
