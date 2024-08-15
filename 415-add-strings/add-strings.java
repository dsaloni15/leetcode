class Solution {
    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while(i>=0 || j>=0 || carry !=0){
            int d1 = (i>=0) ? arr1[i]-'0' : 0;
            int d2 = (j>=0) ? arr2[j]-'0' : 0;

            int sum = d1+d2+carry;
            carry = sum/10;
            res.append(sum%10);

            i--;
            j--;
        }
        return res.reverse().toString();
    }
}