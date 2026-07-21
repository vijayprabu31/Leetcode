class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int sum=0;
        int sum1=0;
        for(int i=0;i<t.length();i++)
        {
            sum+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++)
        {
            sum1+=s.charAt(i);
        }
        int a=Math.abs(sum1-sum);
        return (char)a;
    }
}
