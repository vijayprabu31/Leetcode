class Solution 
{
    public List<String> splitWordsBySeparator(List<String> words, char separator) 
    {
        List<String> l=new ArrayList<>();
        String sp="";
        if (separator == '.' || separator == '|' || separator == '$' || 
            separator == '^' || separator == '*' || separator == '+' || 
            separator == '?' || separator == '\\') 
        {
            sp += "\\";
        }
        sp+=separator;
        for(String x:words)
        {
            String arr[]=x.split(sp);
            for(int i=0;i<arr.length;i++)
            {
                if (!arr[i].isEmpty())
                    l.add(arr[i]);
            }
        }
        return l;
    }
}
