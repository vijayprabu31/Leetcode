class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length,k=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    l.add(nums1[i]);
                }
            }
        }
        Set<Integer> s=new HashSet<>();
        int p=l.size();
        for(int i:l)
        {
            s.add(i);
        }
        int a=s.size();
        int arr[]=new int[a];
        for(int i: s)
        {
            arr[k++]=i;
        }
        return arr;
    }
}
