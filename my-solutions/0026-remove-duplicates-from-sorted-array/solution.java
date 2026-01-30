class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        Set<Integer> s = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int j=0;
        for(int i: s)
        {
            nums[j++]=i;
        }
        return s.size();
    }
}
