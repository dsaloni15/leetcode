class Solution {
    public int numberOfMatches(int n) {
        int tot = 0;
        while(n>1){
            if(n%2==0){
                tot += n/2;
                n /= 2;
            }
            else{
                tot += (n-1)/2;
                n = (n-1)/2 + 1;
            }
        }
        return tot;
    }
}