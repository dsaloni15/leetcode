class Solution {
    public double myPow(double x, int n) {
        return calcPow(x,(long)n);
    }
    public double calcPow(double x,long n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 1.0/calcPow(x,-n);
        }
        if(n%2 == 1){
            return x * calcPow(x*x,(n-1)/2);
        }else{
            return calcPow(x*x,n/2);
        }
    }   
}