class Solution 
{
    public int numWaterBottles(int n, int e) 
    {
        int sum=n;
        int s1=n/e;
        int s2=n%e;     
        while(s1>=1)
        {
            sum+=s1;   
            int su=s1+s2;
            s1=su/e;
            s2=su%e;
        }
        return sum;
    }
}
