class Solution {
    public int minOperations(int n) {
       int mid = -1;
       int idx = 0;
       int res = 0;

       if((n&1) == 1){
        idx = n/2;
        mid = (2*idx)+1;
       }
       else{
        idx = (n/2)-1;
        mid = (2*idx)+2;
        res += 1;
       }
       int req = mid*idx;
       int sum = (int)(((double)idx/2)*(double)(1+(2*idx-1)));
       return res+req-sum;
    }
}