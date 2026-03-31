class Solution 
{
    public int calPoints(String[] o) 
    {
        int arr[] = new int[o.length];
        int k = 0;
        for(int i = 0; i < o.length; i++)
        {
            String s = o[i];
            if(s.equals("C"))
            {
                k--;
            }
            else if(s.equals("D"))
            {
                arr[k]=arr[k-1]*2;
                k++;
            }
            else if(s.equals("+"))
            {
                arr[k]=arr[k-1]+arr[k-2];
                k++;
            }
            else
            {
                arr[k]=Integer.parseInt(s);
                k++;
            }
        }       
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
