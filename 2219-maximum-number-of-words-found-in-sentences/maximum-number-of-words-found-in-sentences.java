class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            max = Math.max(max,countWords(sentences[i]));
        }
        return max;
    }
    public int countWords(String str){
        int count = 1;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}