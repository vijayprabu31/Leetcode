class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> l1 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t=='(' || t=='[' || t=='{')
            {
                l1.push(t);
            }
            else
            {
                if(l1.isEmpty())
                    return false;
                char a=l1.pop();
                if(t==')' && a!='(') return false;
                if(t==']' && a!='[') return false;
                if(t=='}' && a!='{') return false;
            }
        }
        return l1.isEmpty();
    }
}
