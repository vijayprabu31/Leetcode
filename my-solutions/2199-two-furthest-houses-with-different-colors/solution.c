int maxDistance(int* colors, int colorsSize) 
{
    int n=colorsSize;
    int i=0,j=n-1,max1=0,max2=0;
    while(i<j)
    {
        if(colors[i]!=colors[j])
        {
            max1=j-i;
            break;
        }
        j--;
    }
    j=n-1;
    while(i<j)
    {
       if(colors[i]!=colors[j])
        {
            max2=j-i;
            break;
        }
        i++; 
    }
    if(max1<max2)
    {
        return max2;
    }
    return max1;
}
