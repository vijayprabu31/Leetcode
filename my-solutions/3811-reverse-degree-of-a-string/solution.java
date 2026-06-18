class Solution 
{
    public int reverseDegree(String s) 
    {
        int pro=1,sum=0;
        for(int i=1;i<=s.length();i++)
        {
            char c=s.charAt(i-1);
            int d=123-c;
            pro=d*i;
            sum+=pro;
        }  
        return sum; 
    }
}
