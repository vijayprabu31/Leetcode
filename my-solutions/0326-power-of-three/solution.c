bool isPowerOfThree(int n)
{
    if(n<0 || n==0)
    {
        return false;
    }
    int i;
    for(i=0;pow(3,i)<=n;i++)
    {
        if(pow(3,i)==n)
        {
            return true;
        }
    }  
    return false;  
}
