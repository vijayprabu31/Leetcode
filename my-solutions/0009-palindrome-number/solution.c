bool isPalindrome(int x) 
{
    int n,r;
    long s=0;
    n=x;
    while(x>0)
    {
        r=x%10;
        s=(s*10)+r;
        x=x/10;
    }
    if(n==s)
    {
        return true;
    }    
    else
    {
        return false;
    }
}
