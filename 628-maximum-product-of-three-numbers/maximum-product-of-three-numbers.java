class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int m1 = nums[n-1]*nums[n-2]*nums[n-3];
       int m2 = nums[0]*nums[1]*nums[n-1];

       if(m1>m2){
        return m1;
       }
       return m2;
    }
}