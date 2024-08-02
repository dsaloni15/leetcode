class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int totOnes = 0;
        for(int i = 0 ; i < n;i++){
            totOnes += nums[i];
        }

        int i = 0;
        int j = 0;
        int currOnes = 0;
        int maxCount = 0;

        while(j<2*n){
            if(nums[j%n] == 1){
                currOnes++;
            }
            if(j-i+1 > totOnes){
                currOnes -= nums[i%n];
                i++;
            }
            maxCount = Math.max(maxCount,currOnes);
            j++;
        }
        return totOnes - maxCount;
    }
}