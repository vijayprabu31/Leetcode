class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        int n=(int)Math.pow(num,0.5);
        if((n*n)==num)
        {
            return true;
        }
        return false;
    }
}
