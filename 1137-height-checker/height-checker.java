class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            expected[i] = heights[i];
        }

        for(int i = 1 ; i < expected.length ; i++){
            int curr = expected[i];
            int prev = i-1;

            while(prev >= 0 && expected[prev] > curr){
                expected[prev+1] = expected[prev];
                prev--;
            }
            expected[prev+1] = curr;
        }

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}