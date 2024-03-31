class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();
            int ans_size = ans.size();
            
            for(int i = 0 ; i < ans_size ; i++){
                if(ans.get(i)*2 - 1 <= n){
                    temp.add(ans.get(i)*2-1);
                }
            }

            for(int i = 0 ; i < ans_size ; i++){
                if(ans.get(i)*2 <= n ){
                    temp.add(ans.get(i)*2);
                }
            }
            ans = temp;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }

        return result;
        
    }
}