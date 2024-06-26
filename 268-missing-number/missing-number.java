class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n+1) / 2;
        int arrSum = 0;

        for(int i = 0;i <= n-1 ; i++){
            arrSum += nums[i];
        }
        return totalSum-arrSum;
    }
}