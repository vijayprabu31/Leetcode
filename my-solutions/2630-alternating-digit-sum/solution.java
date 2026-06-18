class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int sum=0;
        String a=String.valueOf(n);
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(i%2==0)
            {
                sum+=a.charAt(i)-'0';
            }
            else
            {
                sum-=a.charAt(i)-'0';
            }
        }
        return sum;
    }
}
