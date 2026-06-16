class Solution 
{
    public int[] getConcatenation(int[] n) 
    {
        int arr[]=new int[2*n.length];
        System.arraycopy(n,0,arr,0,n.length);
        System.arraycopy(n,0,arr, n.length, n.length);
        return arr;
    }
}
