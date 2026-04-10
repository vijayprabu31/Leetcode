class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String c = s.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(c);
        String r = c.replaceAll("\\s+", "").toLowerCase();
        String a = new StringBuilder(r).reverse().toString().toLowerCase();
        if(r.equals(a))
        {
            return true;
        }
        return false;
    }
}
