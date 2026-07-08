class Solution 
{
    public int percentageLetter(String s, char l) 
    {
        int n=s.length();
        int count=0;
        for(Character x:s.toCharArray())        
        {
            if(x==l)
            {
                count++;
            }
        }
        return (int)(count*100)/n;
    }
}
