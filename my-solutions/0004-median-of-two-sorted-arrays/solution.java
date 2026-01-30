class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int arr[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!=0)
        {
            double a=arr[(n-1)/2];
            return a;
        }
        else
        {
            double a=(double)(arr[n/2]+arr[(n/2)-1])/2;
            return a;
        }
    }
}
