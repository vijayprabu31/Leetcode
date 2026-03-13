class Solution 
{
    public int findPoisonedDuration(int[] t, int d) 
    {
        int total = 0;
        for (int i = 0; i < t.length-1; i++) 
        {
            if (t[i+1] <= t[i] + d-1) 
            {
                total += t[i+1] - t[i];
            } 
            else 
            { 
                total += d;
            }
        }
        total += d; 
        return total;
    }
}
