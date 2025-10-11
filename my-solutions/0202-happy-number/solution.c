bool isHappy(int n) 
{
    if(n==1 || n==7)
    {
        return true;
    }
    if(0<n && n<10)
    {
        if(n!=1 || n!=7)
        {
            return false;
        }
    }
    else
    {
        int sum = 0;
        while (n > 0) 
        {
            int r = n % 10; 
            sum += r * r; 
            n /= 10;
        }
        return isHappy(sum);
    }
}
