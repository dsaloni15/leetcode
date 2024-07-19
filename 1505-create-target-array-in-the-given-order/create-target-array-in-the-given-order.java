class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] targetArray = new int[n];
        List<Integer> targetList = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            targetList.add(index[i] , nums[i]); 
        }
        for(int i = 0 ; i < n ; i++){
            targetArray[i] = targetList.get(i); 
        }
        return targetArray;
    }
}