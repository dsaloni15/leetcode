class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Collections.sort(nums);
        // int count = 0;
        // int left = 0;
        // int right = nums.size()-1;

        // while(left <= right){
        //     if(nums.get(left)+nums.get(right) < target){
        //         count += right-left;
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return count;
        Integer arr[] = nums.toArray(new Integer [nums.size()]);
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[i]+arr[j] < target){
                    count++;
                }
            }
        }
        return count;
    }
}