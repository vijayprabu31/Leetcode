class Solution 
{
    public int strStr(String h, String n) 
    {
        int result=find(h,n);
        return result;
    }
    public int find(String h,String n)
    {
        int f1=h.indexOf(n);
        if(f1==-1)
        {
            return -1;
        }
        return f1;
    }
}
