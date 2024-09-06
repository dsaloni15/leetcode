class Solution {
    public String getEncryptedString(String s, int k) {
    
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        for(int i = 0 ; i < s.length() ; i++){
            sb.setCharAt(i, s.charAt((i+k) % n));
        }
        return sb.toString();
    }
}