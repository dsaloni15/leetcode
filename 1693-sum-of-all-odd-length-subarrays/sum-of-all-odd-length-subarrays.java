class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ;j+=2){
                sum += arr[j];
                for(int k = i ; k < j ; k++){
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}