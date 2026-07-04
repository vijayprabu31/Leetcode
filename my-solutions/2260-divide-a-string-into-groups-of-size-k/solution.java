class Solution 
{
    public String[] divideString(String s, int k, char fill) 
    {
        int n=s.length();    
        List<String> l=new ArrayList<>();
        if(n%k!=0)
        {
            int z=(int)n%k;
            int p=k-z;
            for(int i=0;i<p;i++)
            {
                s+=fill;
            }
        }
        for(int i=0;i<s.length();i+=k)
        {
            int end = Math.min(i + k, s.length());
            l.add(s.substring(i,end));
        }
        String arr[]=new String[l.size()];
        int c=0;
        for(String x:l)
        {
            arr[c++]=x;
        }
        return arr;
    }
}
