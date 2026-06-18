class Solution 
{
    public int heightChecker(int[] h) 
    {
        int c=0;
        int s[]=h.clone();
        Arrays.sort(h);
        for(int i=0;i<h.length;i++)
        {
            if(s[i]!=h[i]) c++;
        }
        return c;
    }
}
