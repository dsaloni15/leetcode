class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for(int i = 0 ; i < nums.length ;i++){
            totalXor ^= nums[i];
        }
        int diff = (totalXor ^ k);
        return Integer.bitCount(diff);
    }
}