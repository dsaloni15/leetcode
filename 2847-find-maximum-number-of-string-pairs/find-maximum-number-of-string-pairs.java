class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i = 0;i < words.length ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                String a = words[i];
                String b = words[j];
                if(a.charAt(0)==b.charAt(1) && a.charAt(1)==b.charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }
}