class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        // Check if n is a power of 2
        if ((n & (n - 1)) != 0) {
            return false;
        }
        // Check if the only set bit is in an even position
        return (n & 0x55555555) != 0;
    }
}