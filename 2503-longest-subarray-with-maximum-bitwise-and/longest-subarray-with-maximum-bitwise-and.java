class Solution {
    public int longestSubarray(int[] nums) {
        int maxAnd = Integer.MIN_VALUE;
        int maxLength = 0;
        int currLength = 0;

        for(int num:nums){
            if(num > maxAnd){
                maxAnd = num;
            }
        }
        for(int num:nums){
            if(num == maxAnd){
                currLength++;
                maxLength = Math.max(currLength,maxLength);
            }else{
                currLength = 0;
            }
        }
        return maxLength;
    }
}