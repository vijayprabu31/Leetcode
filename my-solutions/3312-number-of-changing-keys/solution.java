class Solution 
{
    public int countKeyChanges(String s) 
    {
        int count=0;
        String a=s.toLowerCase();
        for(int i=0;i<a.length()-1;i++)
        {
            int c=a.charAt(i);
            int d=a.charAt(i+1);
            if(c!=d)
            {
                count++;
            }
        }
        return count;
    }
}
