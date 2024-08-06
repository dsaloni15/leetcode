class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        if(words.size() != s.length()){
            return false;
        }
        for(int i = 0 ; i < n ; i++){
            String ch = words.get(i);
            char c = ch.charAt(0);
            if(c != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}