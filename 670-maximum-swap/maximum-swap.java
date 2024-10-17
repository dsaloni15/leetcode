class Solution {
    public int maximumSwap(int num) {
        String numS = Integer.toString(num);
        char[] arr = numS.toCharArray();
        int n = arr.length;

        int[] last = new int[10];
        for(int i = 0 ; i < n ; i++){
            last[arr[i]-'0'] = i;
        }

        for(int i = 0 ; i < n ; i++){
            for(int d = 9 ; d > arr[i]-'0' ; d--){
                if(last[d] > i){
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num;
    }
}