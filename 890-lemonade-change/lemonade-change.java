class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean ans = true;
        int n = bills.length;
        
        int countFive = 0;
        int countTen = 0;

        for(int i = 0 ; i < n ; i++){
            if(bills[i] == 5){
                countFive++;
            }
            else if(bills[i] == 10){
                if(countFive > 0){
                    countFive--;
                    countTen++;
                }else{
                    return false;
                }
            }else if(countFive > 0 && countTen > 0){
                countFive--;
                countTen--;
            }else if(countFive >= 3){
                countFive -= 3;
            }else{
                return false;
            }
        }
        return true;
    }
}