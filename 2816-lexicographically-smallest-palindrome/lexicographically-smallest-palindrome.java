class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        char[] arr = new char[n];

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                char smallerChar = (s.charAt(i) < s.charAt(j))? s.charAt(i):s.charAt(j);
                arr[i] = smallerChar;
                arr[j] = smallerChar;
            }else{
                arr[i] = s.charAt(i);
                arr[j] = s.charAt(j);
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}