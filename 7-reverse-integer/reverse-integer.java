class Solution {
    public int reverse(int x) {
        int rev = 0;

        if(x >= 0 && x <= Math.pow(2,31)-1){
            while(x > 0){
                int lastDigit = x % 10;
                if (rev > (Integer.MAX_VALUE - lastDigit) / 10) {
                    return 0;
                }
                rev = (rev*10) + lastDigit;
                x = x / 10;
            }
        }
        else if(x <= 0 && x >= Math.pow(-2,31)){
             while(x < 0){
                int lastDigit = x % 10;
                if (rev < (Integer.MIN_VALUE - lastDigit) / 10) {
                    return 0;
                }
                rev = (rev*10) + lastDigit;
                x = x / 10;
            }
        }
        else{
            return -1;
        }
        return rev;
    }
}