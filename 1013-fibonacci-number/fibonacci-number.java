class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
      
        int ans = fib(n-2)+fib(n-1);
        return ans;
    }
}