class Solution {
    public boolean canAliceWin(int[] nums) {
        // int[] doubleDig = new int [nums.length];
        // int[] singleDig = new int [nums.length];
        // int singleSum = 0;
        // int doubleSum = 0;

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] > 9){
        //         doubleDig[i] = nums[i];
        //     }else{
        //         singleDig[i] = nums[i];
        //     }
        // }
        // for(int i = 0 ; i < nums.length ; i++){
        //     singleSum += singleDig[i];
        // }
        // for(int i = 0 ; i < nums.length ; i++){
        //     doubleSum += doubleDig[i];
        // }
        // if(singleSum == doubleSum){
        //     return false;
        // }
        // return true;
        int sum1=0;
        int sum2=0;
        for(int i:nums)
        {
            if(i>9)
            {
                sum1=sum1+i;
            }
            else
            {
                sum2=sum2+i;
            }
         }
        if(sum1==sum2)
        {
            return false;
        }
        return true;
    }
}