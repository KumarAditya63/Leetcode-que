class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int n = height.length;
        int lp = 0, rp = n - 1;

        while(lp < rp){
            int width = rp - lp;
            int h = Math.min(height[lp],height[rp]);
            int current = width * h;
            maxwater = Math.max(current,maxwater);

            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;
        
    }
}