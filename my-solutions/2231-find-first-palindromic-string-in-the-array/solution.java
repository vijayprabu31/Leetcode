class Solution 
{
    public String firstPalindrome(String[] w) 
    {
        for (int i = 0; i < w.length; i++) 
        {
            String x = w[i];
            String s = new StringBuilder(x).reverse().toString();         
            if (x.equals(s)) 
            {
                return x;
            }
        }
        return "";
    }
}

