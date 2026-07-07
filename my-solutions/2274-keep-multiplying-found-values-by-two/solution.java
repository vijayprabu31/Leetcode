class Solution 
{
    public int findFinalValue(int[] n, int o) 
    {
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==o)
            {
                return findFinalValue(n,o*2);
            }
        }
        return o;
    }
}
