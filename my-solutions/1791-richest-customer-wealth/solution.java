class Solution 
{
    public int maximumWealth(int[][] a)  
    {
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
            l.add(sum);
        }
        return Collections.max(l);
    }
}
