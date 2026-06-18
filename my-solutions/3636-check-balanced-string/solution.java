class Solution 
{
    public boolean isBalanced(String num) 
    {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            int a=c-'0';
            if(i%2==0)
            {
                s1+=a;
            }
            else
            {
                s2+=a;
            }
        }
        if(s1==s2)
        {
            return true;
        }
        return false;
    }
}
