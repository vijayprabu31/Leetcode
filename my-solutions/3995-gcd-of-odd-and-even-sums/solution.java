class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {
        int os=0,es=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                es+=i;
            }
            else
            {
                os+=i;
            }
        }
        while (os != 0) 
        {
            int temp = os;
            os = es % os;
            es = temp;
        }
        return es;
    }
}
