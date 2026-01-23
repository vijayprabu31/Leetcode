class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int v=0,a=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            a=columnTitle.charAt(i)-64;
            v=(v*26)+a;
        }
        return v;
    }
}
