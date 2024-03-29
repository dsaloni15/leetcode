import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        for(int i = 1; i<nums.length -1 ; i++){
            if((nums[i-1] + 1 < nums[i]) && (nums[i+1] - 1 > nums[i])){
                ans.add(nums[i]);
            }
        }
        if(nums.length > 1){
            if(nums[0] +1 < nums[1]){
                ans.add(nums[0]);
            }
            if(nums[nums.length - 2] + 1 < nums[nums.length-1]){
                ans.add(nums[nums.length - 1]);
            }
        }
        return ans;
    }
}