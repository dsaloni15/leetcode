class Solution {
    public int differenceOfSum(int[] nums) {
        int elsum = 0;
        int digsum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            elsum += nums[i];
        }

        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i]>0){
                int ld = nums[i]%10;
                digsum += ld;
                nums[i] /= 10;
            }
        }
        return Math.abs(elsum-digsum);
    }
}