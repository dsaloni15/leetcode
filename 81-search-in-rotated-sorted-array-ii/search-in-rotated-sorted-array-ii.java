class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[s] == nums[mid] && nums[mid] == nums[e]){
                s = s+1;
                e = e-1;
                continue;
            }
            else if(nums[s] <= nums[mid]){
                if(nums[s] <= target && nums[mid] >= target){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(nums[e]>=target && target >= nums[mid]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return false;
    }
}