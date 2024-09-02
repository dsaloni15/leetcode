class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE;
        int n = values.length;
        int maxI = values[0];

        for(int j = 1 ; j < n ; j++){
            max = Math.max(max,maxI + values[j] - j);
            maxI = Math.max(maxI,values[j] + j);
        }
        return max;
    }
}