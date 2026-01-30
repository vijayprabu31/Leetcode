class Solution 
{
    public int maxArea(int[] height) 
    {
        int n=height.length;
        int i=0,j=n-1;
        int max=0,h=0;
        while(i<j)
        {
            if(height[i]<height[j])
            {
                max=Math.max(height[i]*(j-i),max);
                i++;
            }
            else
            {
                max=Math.max(height[j]*(j-i),max);
                j--;
            }
        }
        return max;
    }
}
