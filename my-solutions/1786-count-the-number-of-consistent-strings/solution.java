class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        char c[]=allowed.toCharArray();
        int count=0;
        for(String s:words)
        {
            int co=0;
            for(int j=0;j<s.length();j++)
            {
                for(int i=0;i<c.length;i++)
                {
                    if(s.charAt(j)==c[i])
                    {
                        co++;
                        break;
                    }
                }
            }
            if(co==s.length()) count++;
        }
        return count;
    }
}
