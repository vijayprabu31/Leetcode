class Solution 
{
    public int thirdMax(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
        {
            set.add(i);
        }
        if (set.size()<3)
        {
            return Collections.max(set);
        }
        for (int i = 0; i < 2; i++) 
        {
            int currentMax = Collections.max(set);
            set.remove(currentMax);
        }
        return Collections.max(set);
    }
}

