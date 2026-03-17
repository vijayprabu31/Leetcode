class Solution 
{
    public char nextGreatestLetter(char[] l, char t) 
    {
        int n=l.length;
        for(int i=0;i<n;i++)
        {
            if(t<l[i])
            {
                return l[i];
            }
        }
        return l[0];
    }
}
