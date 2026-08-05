class Solution 
{
    public int getLucky(String s, int k) 
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            int b=a-'`';
            String st=String.valueOf(b);
            str+=st;
        }
        int val=0;
        for(int i=0;i<str.length();i++)
        {
            val+=str.charAt(i)-'0';
        }
        int res=0;
        for(int i=0;i<k-1;i++)
        {
            int sum=0;
            while(val>0)
            {
                int r=val%10;
                sum+=r;
                val/=10;
            }
            val=sum;
            res=sum;
        }
        if (k==1) res=val;
        return res;
    }
}
