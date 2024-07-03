class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
        int element = 1;

        while(element <= n*n){

            //top
            for(int j = startCol ; j <= endCol ; j++){
                matrix[startRow][j] = element++;
            }
            //right
            for(int i = startRow+1 ; i <= endRow ; i++){
                matrix[i][endCol] = element++;
            }
            //bottom
            for(int j = endCol-1 ; j >= startCol ; j--){
                if(startRow == endRow){
                    break;
                }
                matrix[endRow][j] = element++;
            }
            //left
            for(int i = endRow-1 ; i >= startRow+1 ; i--){
                if(startCol == endCol){
                    break;
                }
                matrix[i][startCol] = element++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}