class Solution 
{
    public boolean areNumbersAscending(String s) 
    {
        String a[]=s.split(" ");
        List<Integer> temp = new ArrayList<>();
        for (String str : a) 
        {
            try 
            {
                int num = Integer.parseInt(str);
                temp.add(num);
            } catch (NumberFormatException e) {}
        }
        int[] output = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) 
        {
            output[i] = temp.get(i);
        }
        for (int i = 0; i < output.length - 1; i++) 
        {
            if (output[i] >= output[i + 1]) 
            {
                return false; 
            }
        }
        return true;
    }
}
