class Solution {
    public String triangleType(int[] nums) 
    {
        if(nums[0]+nums[1]<=nums[2]||nums[0]+nums[2]<=nums[1]||nums[1]+nums[2]<=nums[0])  
        {
            return "none";
        }
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }
        if (s.size() == 1) {
            return "equilateral";
        }
        if (s.size() == 2) {
            return "isosceles";
        }
        if (s.size() == 3) {
            Integer[] elements = s.toArray(new Integer[0]);
            int val1 = elements[0];
            int val2 = elements[1];
            int val3 = elements[2];
            return "scalene";
        }
        return "none";
    }
}

