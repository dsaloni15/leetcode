class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp){
            if(height[lp]<height[rp]){
                maxWater = Math.max(maxWater,height[lp]*(rp-lp));
                lp++;
            }
            else{
                maxWater = Math.max(maxWater,height[rp]*(rp-lp));
                rp--;
            }
        }
        return maxWater;
    }
}