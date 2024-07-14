class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n = nums.size();
        int res=0;

        for(int i = 0 ;i < n; i++){
            if(countBits(i)==k){
                res+=nums.get(i);
            }
        }
        return res;
    }
    public int countBits(int n){
        int count = 0;
        while(n != 0){
            count+=(n&1);
            n=n>>1;
        }
        return count;
    }
}