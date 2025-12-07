class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < accounts.length ; i++){
            int curr = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                curr += accounts[i][j];
            }
            if(ans < curr){
                ans = curr;
            }
        }
        return ans;
    }
}