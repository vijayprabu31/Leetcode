class Solution {
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int m1,m2;
        m1=prices[0];
        m2=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<m1)
            {
                m1=prices[i];
            }
            else if(prices[i]-m1>m2)
            {
                m2=prices[i]-m1;
            }
        }
        return m2;
    }
}
