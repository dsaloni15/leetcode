class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            int count = sentences[i].split(" ").length;
           
            if(maxCount < count){
                maxCount = count;
            }
        }
        return maxCount;
    }
}