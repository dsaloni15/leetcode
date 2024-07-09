class Solution {
    public int minPartitions(String n) {
        char max = n.charAt(0);

        for(int i = 1 ; i < n.length() ; i++){
            if(max < n.charAt(i)){
                max = n.charAt(i);
            }
        }
        return max-'0';
    }
}