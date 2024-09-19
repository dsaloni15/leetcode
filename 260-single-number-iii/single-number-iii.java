class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];
        int idx = 0;
        for(int i = 0 ; i < n ; i++){
            boolean found = false;
            for(int j = 0 ; j < n ; j++){
                if(i != j && nums[i] == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                res[idx++] = nums[i];
                if(idx == 2){
                    break;
                }
            }
        }
        
        return res;
    }
}