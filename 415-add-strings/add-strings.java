import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        // Add the numbers
        BigInteger res = a.add(b);

        // Convert the result back to a string
        String ans = res.toString();

        return ans;
    }
}