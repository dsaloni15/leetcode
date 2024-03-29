class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i< n; i++){
            if(i!=0 && (nums[i-1]==nums[i] || nums[i-1]==nums[i]-1)){
                continue;
            }
            if(i!=n-1 &&(nums[i+1]==nums[i] || nums[i+1]==nums[i]+1)){
                continue;
            }
            result.add(nums[i]);
        }
        return result;
    }
}