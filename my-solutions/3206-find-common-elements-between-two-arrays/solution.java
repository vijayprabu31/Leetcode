class Solution 
{
    public int[] findIntersectionValues(int[] nums1,int[] nums2) 
    {
        Set<Integer> l =new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    l.add(nums1[i]);
                }
            }
        }
        int arr[]=new int[2];
        int count1=0,count2=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int x:l)
            {
                if(x==nums1[i]) count1++;
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int x:l)
            {
                if(x==nums2[i]) count2++;
            }
        }
        arr[0]=count1;
        arr[1]=count2;
        return arr;
    }
}
