class Solution {
    public String replaceDigits(String s) {
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(i%2 != 0){
                ans += shift(s.charAt(i-1),s.charAt(i)-'0');
            }else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    public char shift(char c,int x){
        return (char)((int)c+x);
    }
}