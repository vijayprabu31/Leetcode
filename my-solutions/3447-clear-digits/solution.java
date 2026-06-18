class Solution 
{
    public String clearDigits(String s) 
    {
        Stack<Character> l=new Stack<>();
        for(char x:s.toCharArray())
        {
            if(Character.isDigit(x) && !l.isEmpty())
            {
                l.pop();
            }
            else
            {
                l.push(x);
            }
        }
        StringBuilder a=new StringBuilder();
        while(!l.isEmpty())
        {
            a.append(l.pop());
        }
        return a.reverse().toString();
    }
}
