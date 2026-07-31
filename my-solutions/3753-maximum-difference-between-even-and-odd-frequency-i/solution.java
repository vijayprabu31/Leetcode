class Solution 
{
    public int maxDifference(String s) 
    {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            arr[a-'a']++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                max=Math.max(max,arr[i]);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]>0)
            {
                min=Math.min(arr[i],min);
            }
        }
        return max-min;
    }
}
