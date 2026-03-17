class Solution 
{
    public int mostWordsFound(String[] s) 
    {
        int m = 0;
        for (int i=0;i<s.length;i++) 
        {
            String[] w=s[i].split(" "); 
            if (w.length>m) 
            {
                m=w.length;
            }
        }
        return m;
    }
}
