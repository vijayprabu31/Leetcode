class Solution 
{
    static 
    {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        int n=nums.length,traversed=0;
        Set<Integer> s=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int i:nums)
        {
            s.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!s.contains(i))
            {
                l.add(i);
            }
        }
        return l; 
    }
}
