class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> l = new ArrayList<>();
        int val = 0; 
        for(int i : nums)
        {
            val=(val*2+i)%5;
            if(val==0) 
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        return l;
    }
}
