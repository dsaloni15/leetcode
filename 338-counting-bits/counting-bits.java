class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        ans[0] = 0;
        for(int i = 0 ; i <= n ; i++){
            ans[i] = bin(i);
        }
        return ans;
    }
    public int bin(int i){
        int tot = 0;
        while(i > 0){
            if(i%2 == 1){
                tot++;
            }
            i /= 2;
        }
        return tot;
    }
}