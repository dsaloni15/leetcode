class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int n = s.length();
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '*'){
                count++;
            }if(s.charAt(i) == '|'){
                j = i+1;
                while(s.charAt(j) != '|'){
                    j++;
                }
                i = j;
            }
        }
        return count;
    }
}