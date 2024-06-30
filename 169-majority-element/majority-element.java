class Solution {
    public int majorityElement(int[] nums) {
        // int winner=nums[0];
        // int lead=1;

        // for(int idx=0;idx<nums.length;idx++){
        //     if(nums[idx]==winner){
        //         lead++;
        //     }
        //     else if(lead>0){
        //         lead--;
        //     }
        //     else{
        //         winner=nums[idx];
        //         lead=1;
        //     }
        // }
        // return winner;
        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}