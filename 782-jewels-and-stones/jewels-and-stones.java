class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0 ; i < jewels.length() ;i++){
            for(int j = 0 ; j <stones.length() ;j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count += stones.charAt(j) == jewels.charAt(i) ? 1 : 0 ;
                }
            }
        }
        return count;
    }
}