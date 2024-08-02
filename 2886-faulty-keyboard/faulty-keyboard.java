class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c != 'i'){
                sb.append(c);
            }else if(c == 'i'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}