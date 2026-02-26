import java.math.BigInteger;
class Solution 
{
    public int numSteps(String s) 
    {
        BigInteger a = new BigInteger(s,2);
        int count=0;
        BigInteger one=BigInteger.ONE;
        BigInteger two=BigInteger.valueOf(2);
        while (!a.equals(one)) 
        {
            if (a.mod(two).equals(BigInteger.ZERO)) 
            {
                a=a.divide(two);
            } 
            else 
            {
                a=a.add(one);
            }
            count++;
        }
        return count;
    }
}
