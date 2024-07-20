class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        char[] arr = boxes.toCharArray();
        int[] answer = new int[n];

        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(i != j && arr[j] =='1'){
                    count += Math.abs(j-i);
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}