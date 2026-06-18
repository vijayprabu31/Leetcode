import java.util.*;
class Solution 
{
    public int trap(int[] h)
    {
        int n=h.length,t=0,l=0,r=0,i=0,j=n-1;
        while (i<j)
        {
            l=Math.max(l,h[i]);
            r=Math.max(r,h[j]);
            if (l<r)
            {
                t+=l-h[i];
                i++;
            }
            else
            {
                t+=r-h[j];
                j--;
            }
        }
        return t;
    }
}
