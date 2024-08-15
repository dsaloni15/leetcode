class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 0){
            return ans;
        }
        
        int left = leftIndex(nums,target);
        int right = rightIndex(nums,target);
        ans[0] = left;
        ans[1] = right;

        return ans;
    }
    public int leftIndex(int[]nums,int target){
        int left = 0;
        int right = nums.length-1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }
    public int rightIndex(int[]nums,int target){
        int left = 0;
        int right = nums.length-1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) idx = mid;
        }

        return idx;
    }
}