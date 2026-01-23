class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) i++;
            else if (i + 1 < flowerbed.length && flowerbed[i+1] == 1) i+=2;
            else if (i > 0 && flowerbed[i-1] == 1) continue;
            else {
                n--;
                i++;
            }
        }
        return n <= 0;
    }
}
