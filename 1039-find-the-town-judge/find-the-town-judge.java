class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[1001];
        int[] trustedCount = new int[1001];
       
        for(int i = 0 ; i < trust.length ; i++){
            int a = trust[i][0];
            int b = trust[i][1];

            trustCount[b]++;
            trustedCount[a]++;
        }

        for(int i = 1 ; i <= n ; i++){
            if(trustCount[i] == n-1 && trustedCount[i] == 0){
                return i;
            }
        }
        return -1;
    }
}