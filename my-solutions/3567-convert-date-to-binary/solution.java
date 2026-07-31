class Solution 
{
    public String convertDateToBinary(String date) 
    {
        String arr[]=date.split("-");
        String res="";
        for(int i=0;i<3;i++)
        {
            StringBuilder s=new StringBuilder();
            int a=Integer.parseInt(arr[i]);
            while(a>0)
            {
                int r=a%2;
                s.append(String.valueOf(r));
                a/=2;
            }
            s.reverse();
            res+=s.toString();
            if(i==arr.length-1) break;
            res+="-";
        }
        return res;
    }
}
