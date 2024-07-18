class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        String k1 = "0";
        String k2 = "1";

        if(n == 1){
            ans.add(k1);
            ans.add(k2);
            return ans;
        }

        int k = (1<<n);

        for(int i = 0 ; i < k ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = n-1 ; j >= 0 ;j--){
                if(((i>>j)&1) == 1){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                }
            }

            Boolean isValid = true;
            for(int j = 0; j < n-1 ;j++){
                if(sb.charAt(j) == '0' && sb.charAt(j+1)== '0'){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}