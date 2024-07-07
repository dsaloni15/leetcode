class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(nums);

        if(n == 0){
            return res;
        }
        
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                if(count > n/3 ){
                    res.add(nums[i-1]);
                }
                count = 1;
            }
            
        }
        if(count  > n/3){
            res.add(nums[n-1]);
        }
        return res;
        
    }
}