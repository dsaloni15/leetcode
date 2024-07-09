class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        int n = chars.length;
        if(n==0){
            return 0;
        }

        for(int i = 1; i< n;i++){
            if(chars[i] == chars[i-1]){
                count++;
            }else{
                sb.append(chars[i-1]);
                if(count > 1){
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(chars[n-1]);
        if(count>1){
            sb.append(count);
        }
        for(int i = 0 ; i < sb.length() ; i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}