class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int count=0,con=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
                con=1;
            }
            else if(con==1 && s.charAt(i)==' ')
                break;
        }
        return count;
    }
}
