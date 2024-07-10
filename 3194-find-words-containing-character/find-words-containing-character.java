class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        // for(int i = 0 ; i < words.length ; i++){
        //     for(int j = 0 ; j < words[i].length() ; j++){
        //         if(words[i].charAt(j) == x){
        //             ans.add(i);
        //             break;
        //         }
        //     }
        // }
        int k=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                ans.add(i);
            }
        }
        return ans;
    }
}