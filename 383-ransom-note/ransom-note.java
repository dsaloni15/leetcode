class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i = 0 ; i < magazine.length() ; i++){
            char c = magazine.charAt(i);
            freq[c-'a']++;
        }
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char ch = ransomNote.charAt(i);
            if(freq[ch-'a'] == 0){
                return false;
            }
            freq[ch-'a']--;   
        }
        return true;
    }
}