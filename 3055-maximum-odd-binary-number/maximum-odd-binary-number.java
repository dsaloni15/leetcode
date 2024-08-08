class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] c = s.toCharArray();
        int ones = 0;
        for(char val:c){
            if(val == '1'){
                ones++;
            }
        }
        int zeroes = c.length - ones;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i < ones-1;i++){
            sb.append("1");
        }
        for(int i = 0 ;i < zeroes;i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}