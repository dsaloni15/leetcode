class Solution {
    public int balancedStringSplit(String s) {
        int b = 0;
        int count = 0;

        for(char ch : s.toCharArray()){
            if((b += ch == 'L'?1:-1)==0){
                count++;
            }
        }
        return count;

        // for(int i = 0;i<s.length() ; i++){
        //     if(s.charAt(i) == 'R'){
        //         b++;
        //     }
        //     else{
        //         b--;
        //     }
        //     if(b == 0){
        //         count++;
        //     }
        // }
        // return count;
    }
}