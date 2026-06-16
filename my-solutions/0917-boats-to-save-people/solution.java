class Solution 
{
    public int numRescueBoats(int[] p, int l) 
    {
        Arrays.sort(p);
        int i=0,j=p.length-1,count=0;
        while(i<=j)
        {
            if(p[i]+p[j]<=l)
            {
                count++;
                i++;
                j--;
            }
            else
            {
                count++;
                j--;
            }
        }
        return count;
    }
}
