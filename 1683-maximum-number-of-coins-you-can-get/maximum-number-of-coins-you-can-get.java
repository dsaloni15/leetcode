class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        for(int i = piles.length - 2 ; i >= piles.length/3 ; i=i-2){
            sum += piles[i];
        }
        return sum;
    }
}