class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int arr[]=new int[k];
        Map<Integer,Integer> m = new HashMap<>();
        for (int num : nums) 
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> h = new PriorityQueue<>((a, b)->m.get(a)-m.get(b));
        for (int key:m.keySet()) 
        {
            h.add(key);
            if(h.size()>k) 
            {
                h.poll();
            }
        }
        for (int i=k-1;i>=0;i--) 
        {
            arr[i]=h.poll();
        }
        return arr;
    }
}

