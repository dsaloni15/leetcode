class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] ans = new int[101];
        for(int num:nums){
            ans[num]++;
        }
        for(int i = 1; i < 101 ; i++){
            if(ans[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}