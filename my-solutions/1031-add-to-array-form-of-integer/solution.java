import java.math.BigInteger;
class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        StringBuilder s = new StringBuilder();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<num.length;i++) 
        {
            s.append(num[i]);
        }
        BigInteger a = new BigInteger(s.toString());
        a = a.add(BigInteger.valueOf(k));
        if(a.equals(BigInteger.ZERO)) 
            l.add(0);
        while(a.compareTo(BigInteger.ZERO)>0) 
        {
            l.add(a.remainder(BigInteger.valueOf(10)).intValue());
            a = a.divide(BigInteger.valueOf(10));
        }
        Collections.reverse(l);
        return l;
    }
}

