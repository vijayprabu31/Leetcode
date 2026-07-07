class Solution 
{
    public List<Boolean> kidsWithCandies(int[] c, int e) 
    {
        List<Boolean> l1=new ArrayList<>();
        int n=c.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,c[i]);
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            sum=c[i]+e;
            if(sum>=max)
            {
                l1.add(true);
            }
            else
            {
                l1.add(false);
            }
        }
        return l1;
    }
}
