class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int i = 1;
        int j = x;

        while(i <= j){
            int mid = i + (j-i)/2;

            if(Math.pow(mid,2) == x){
                return mid;
            }
            if(Math.pow(mid,2) > x){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return j;
    }
}