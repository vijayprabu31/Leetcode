class ParkingSystem 
{
    int[] arr=new int[4];
    public ParkingSystem(int big, int medium, int small) 
    {
        arr[1]=big;
        arr[2]=medium;
        arr[3]=small;
    }
    public boolean addCar(int c) 
    {
        if(arr[c]>=1)
        {
            arr[c]=arr[c]-1;
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
