class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        HashMap<Integer,String> m = new HashMap<>();
        int n=names.length;
        for(int i=0;i<names.length;i++)
        {
            m.put(heights[i],names[i]);

        }
        Arrays.sort(heights);
        String[] result = new String[n];
        for (int i=0;i<n;i++) 
        {
            result[i] = m.get(heights[n-1-i]);
        }
        return result;
    }
}
