class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int n = arr.length;
        StringBuilder ans = new StringBuilder("");

        for(int i = 0 ; i < n; i++){
            StringBuilder x = new StringBuilder(arr[i]);
            ans.append(x.reverse().toString());

            if(i!=n-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}