class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;

        for(int i = 0 ; i < nums.length ; i+=2){
            arrSize += nums[i];
        }

        int[] res = new int[arrSize];
        int idx = 0;

        for(int i = 1 ; i < nums.length ;i+=2){
            int freq = nums[i-1];
            while(freq > 0){
                res[idx] = nums[i];
                freq--;
                idx++;
            }
        }
        return res;
    }
}