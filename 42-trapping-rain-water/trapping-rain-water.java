class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //left max boundary-->auxiliary array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //right max boundary--->auxiliary array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i =  n-2; i >=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop
        int trapped_rainwater = 0;
        for(int i = 0 ; i < n ; i++){

            //waterlevel = min(left max boundary , right max boundary)
            int waterlevel= Math.min(leftMax[i],rightMax[i]);

            //trapped rainwater = waterlevel -height[i]
            trapped_rainwater += waterlevel - height[i];
        }
        return trapped_rainwater;
    }
}