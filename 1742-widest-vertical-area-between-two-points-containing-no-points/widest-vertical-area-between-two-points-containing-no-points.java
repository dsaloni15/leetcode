class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];

        for(int i = 0 ; i < points.length ; i++){
            arr[i] = points[i][0];
        } 

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] - arr[i-1] > max){
                max = arr[i]-arr[i-1];
            }
        }
        return max;
    }
}