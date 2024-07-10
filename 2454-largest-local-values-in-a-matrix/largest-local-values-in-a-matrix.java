class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n-2][n-2];

        for(int row = 0; row < n-2 ; row++){
            for(int col = 0 ; col < n-2 ; col++){
                arr[row][col] = findLocalMax(grid,row,col);
            }
        }
        return arr;
    }
    public int findLocalMax(int[][]grid,int row,int col){
        int max = Integer.MIN_VALUE;

        for(int i = row ; i<=row+2 ; i++){
            for(int j = col ; j <= col+2 ; j++){
                max = Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}