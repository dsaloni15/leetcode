class Solution {
    List<List<Integer>>res = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSumSorted(nums,0-nums[i],i+1,nums.length-1);
            }
        }
        return res;
    }
    void twoSumSorted(int nums[],int target,int i, int j){
        int a = nums[i-1];
        while(i<j){
            if(nums[j]+nums[i] == target){
                List<Integer> list = new ArrayList();
                list.add(a);
                list.add(nums[i]);
                list.add(nums[j]);

                res.add(list);

                //duplicate b
                while(i<j && nums[i] == nums[i+1]){
                    i++;
                }
                //duplicate c
                while(i<j && nums[j] == nums[j-1]){
                    j--;
                }
                i++; j--;
            }
            else if(nums[j]+nums[i] > target){
                j--;
            }
            else{
                i++;
            }
        }
    }
}