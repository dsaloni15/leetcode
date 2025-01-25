class Solution {
    public int countSegments(String s) {
        if(s == null || s.trim().isEmpty()){
            return 0;
        }
        boolean isSegment = false;
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                if(!isSegment){
                    count++;
                    isSegment = true;
                }
            }
            else{
                isSegment = false;
            }
        }

        return count;
    }
}